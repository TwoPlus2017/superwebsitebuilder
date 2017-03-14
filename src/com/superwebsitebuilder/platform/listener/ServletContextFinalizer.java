/**
 * 
 */
package com.superwebsitebuilder.platform.listener;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;

/**
 * @author banlibo
 *
 */
public class ServletContextFinalizer implements ServletContextListener {
	private static Log logger = LogFactory.getLog(ServletContextFinalizer.class);
	
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//deregisterJDBCDrivers
		deregisterJDBCDrivers();
		
	    //shutdown mysql AbandonedConnectionCleanupThread
		shutdownACCT();
	}

	private void shutdownACCT() {
		try {
			logger.debug("Shutdown Mysql Abandoned Connection Cleanup Thread.");
		    AbandonedConnectionCleanupThread.shutdown();
		} catch (InterruptedException e) {
		    logger.error("SEVERE problem cleaning up: " + e);
		}
	}

	private void deregisterJDBCDrivers() {
		// ... First close any background tasks which may be using the DB ...
	    // ... Then close any DB connection pools ...

	    // Now deregister JDBC drivers in this context's ClassLoader:
	    // Get the webapp's ClassLoader
	    ClassLoader cl = Thread.currentThread().getContextClassLoader();
	    // Loop through all drivers
	    Enumeration<Driver> drivers = DriverManager.getDrivers();
	    while (drivers.hasMoreElements()) {
	        Driver driver = drivers.nextElement();
	        if (driver.getClass().getClassLoader() == cl) {
	            // This driver was registered by the webapp's ClassLoader, so deregister it:
	            try {
					logger.info("Deregistering JDBC driver {" + driver + "}");
	                DriverManager.deregisterDriver(driver);
	            } catch (SQLException ex) {
	            	logger.error("Error deregistering JDBC driver{" + driver + "}" + ex);
	            }
	        } else {
	            // driver was not registered by the webapp's ClassLoader and may be in use elsewhere
	        	logger.trace("Not deregistering JDBC driver {" + driver + "}" + " as it does not belong to this webapp's ClassLoader");
	        }
	    }
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	}

}
