/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  Constants.java
 * Purpose:   Constants of SWSB application.
 * Classes:   Constants
 */
package com.superwebsitebuilder.espider.constant;

/**
 * Constants of SWSB application. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 9, 2016          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */
public class Constants extends BasicConstants {
	
	/** Represents the sexWords field and all words should be lower case*/
	public static final String[] sexWords = {
		"fucked", "gaping", "pubes", "tranny", "xnxx", "xvideo", "xxxcam", "xxxsex", "adultvideo", "adultanimation", "adultav", "adultgames", "analpay", "analsex", 
		"animalsex", "assgaping", "asstomouth", "beachsex", "bigcock", "bigtits", "childsexualintercourse", "childsex", "creampie", "cumshot", "ejaculation", "exhibitionism", 
		"fallingbody", "freeporn", "handjob", "hardcore", "masturbation", "maturewomen", "metamorphosis", "onenightstand", "oralsex", "pornstar", "pornsex", 
		"porngirl", "pornboy", "sexsearch", "sexualsecretion", "sexualintercourse", "squirting", "transsexual", "virginity", "xxxporn", "xxxphoto", "xxxvideo",
		"crack", "keygen", "hack", "serial key", "ahole", "anus", "ash0le", "ash0les", "asholes", "ass", "ass monkey", "assface", "assh0le", "assh0lez", "asshole", "assholes", 
		"assholz", "asswipe", "azzhole", "bassterds", "bastard", "bastards", "bastardz", "basterds", "basterdz", "biatch", "bitch", "bitches", "blow job", "boffing", "butthole", 
		"buttwipe", "c0ck", "c0cks", "c0k", "carpet muncher", "cawk", "cawks", "clit", "cnts", "cntz", "cock", "cockhead", "cock-head", "cocks", "cocksucker", "cock-sucker", 
		"crap", "cum", "cunt", "cunts", "cuntz", "dick", "dild0", "dild0s", "dildo", "dildos", "dilld0", "dilld0s", "dominatricks", "dominatrics", "dominatrix", "dyke", "enema", 
		"f u c k", "f u c k e r", "fag", "fag1t", "faget", "fagg1t", "faggit", "faggot", "fagit", "fags", "fagz", "faig", "faigs", "fart", "flipping the bird", "fuck", "fucker", 
		"fuckin", "fucking", "fucks", "fudge packer", "fuk", "fukah", "fuken", "fuker", "fukin", "fukk", "fukkah", "fukken", "fukker", "fukkin", "g00k", "gay", "gayboy", "gaygirl", 
		"gays", "gayz", "god-damned", "h00r", "h0ar", "h0re", "hells", "hoar", "hoor", "hoore", "jackoff", "jap", "japs", "jerk-off", "jisim", "jiss", "jizm", "jizz", "knob", 
		"knobs", "knobz", "kunt", "kunts", "kuntz", "lesbian", "lezzian", "lipshits", "lipshitz", "masochist", "masokist", "massterbait", "masstrbait", "masstrbate", "masterbaiter", 
		"masterbate", "masterbates", "motha fucker", "motha fuker", "motha fukkah", "motha fukker", "mother fucker", "mother fukah", "mother fuker", "mother fukkah", 
		"mother fukker", "mother-fucker", "mutha fucker", "mutha fukah", "mutha fuker", "mutha fukkah", "mutha fukker", "n1gr", "nastt", "nigger", "nigur", "niiger", "niigr", 
		"orafis", "orgasim", "orgasm", "orgasum", "oriface", "orifice", "orifiss", "packi", "packie", "packy", "paki", "pakie", "paky", "pecker", "peeenus", "peeenusss", "peenus", 
		"peinus", "pen1s", "penas", "penis", "penis-breath", "penus", "penuus", "phuc", "phuck", "phuk", "phuker", "phukker", "polac", "polack", "polak", "poonani", "pr1c", "pr1ck", 
		"pr1k", "pusse", "pussee", "pussy", "puuke", "puuker", "queer", "queers", "queerz", "qweers", "qweerz", "qweir", "recktum", "rectum", "retard", "sadist", "scank", "schlong", 
		"screwing", "semen", "sex", "sexy", "sh!t", "sh1t", "sh1ter", "sh1ts", "sh1tter", "sh1tz", "shit", "shits", "shitter", "shitty", "shity", "shitz", "shyt", "shyte", "shytty", 
		"shyty", "skanck", "skank", "skankee", "skankey", "skanks", "skanky", "slut", "sluts", "slutty", "slutz", "son-of-a-bitch", "tit", "turd", "va1jina", "vag1na", "vagiina", 
		"vagina", "vaj1na", "vajina", "vullva", "vulva", "w0p", "wh00r", "wh0re", "whore", "xrated", "xxx", "b!+ch", "blowjob", "arschloch", "b!tch", "b17ch", 
		"b1tch", "bi+ch", "boiolas", "buceta", "chink", "cipa", "clits", "cock", "dirsa", "ejakulate", "fatass", "fcuk", "fuk", "fux0r", "hoer", "hore", 
		"jism", "kawk", "l3itch", "l3i+ch", "masturbate", "masterbat*", "masterbat3", "motherfucker", "s.o.b.", "mofo", "nazi", "nigga", "nigger", "nutsack", "phuck", 
		"pimpis", "pusse", "pussy", "scrotum", "sh!t", "shemale", "shi+", "sh!+", "slut", "smut", "teets", "tits", "boobs", "b00bs", "teez", "testical", "testicle", "titt", 
		"w00se", "jackoff", "wank", "whoar", "whore", "*damn", "*dyke", "*fuck*", "*shit*", "@$$", "amcik", "andskota", "arse*", "assrammer", "ayir", "bi7ch", "bitch*", "bollock*", 
		"breasts", "butt-pirate", "cabron", "cazzo", "chraa", "chuj", "Cock*", "cunt*", "d4mn", "daygo", "dego", "dick*", "dike*", "dupa", "dziwka", "ejackulate", "ekrem*", "ekto", 
		"enculer", "faen", "fag*", "fanculo", "fanny", "feces", "feg", "felcher", "ficken", "fitt*", "flikker", "foreskin", "fotze", "fu(*", "fuk*", "futkretzn", "gay", "gook", 
		"guiena", "h0r", "h4x0r", "hell", "helvete", "hoer*", "honkey", "huevon", "hui", "injun", "jizz", "kanker*", "kike", "klootzak", "kraut", "knulle", "kuk", "kuksuger", 
		"kurac", "kurwa", "kusi*", "kyrpa*", "lesbo", "mamhoon", "masturbat*", "merd*", "mibun", "monkleigh", "mouliewop", "muie", "mulkku", "muschi", "nazis", "nepesaurio", 
		"nigger*", "orospu", "paska*", "perse", "picka", "pierdol*", "pillu*", "pimmel", "piss*", "pizda", "poontsee", "poop", "porn", "p0rn", "pr0n", "preteen", "pula", "pule", 
		"puta", "puto", "qahbeh", "queef*", "rautenberg", "schaffer", "scheiss*", "schlampe", "schmuck", "screw", "sh!t*", "sharmuta", "sharmute", "shipal", "shiz", "skribz", 
		"skurwysyn", "sphencter", "spic", "spierdalaj", "splooge", "suka", "b00b*", "testicle*", "titt*", "twat", "vittu", "wank*", "wetback*", "wichser", "wop*", "yed", "zabourah"
	};
	
	/** Represents the copyrightWords field and all words should be lower case */
	public static final String[] copyrightWords = {
		"annie", "casino", "putlocker", "mp3 indir", "bleach soul", "telepaisa en vivo", "phim cap", "vietfun", "trieu chau", "truyen", "truyennguoilon", "coithienthai",
		"phim", "bhrt", "video", "nhau", "cerita berahi", "hisap puting", "mainit malibog"
	};
	
	/** Represents the removedLinks field and all words should be lower case */
	public static final String[] removedLinks = {
		"activeappliances.com", 
		"ecyclebest.com",
		"carzoneautos.com", 
		"womenswalkingshoereview.com",
		"partsgeek.com",
		"carpartsdiscount.com",
		"austintreeexperts.com",
		"austintreesurgeons.com",
		"drjohnbitner.com",
		"sanantoniotreesurgeons.com",
		"breastbodylasvegas.com",
		"everybicycletire.com",
		"kizi.org",
		"livelikeyouarerich.com",
		"mobilmp3.net",
		"unitedrv.com"
	};
	
	/** Represents the IMAGE_JPG_SUFIX field */
	public static final String IMAGE_JPG_SUFIX = ".jpg";
	
	/** Represents the OS_WINDOWS_7 field */
	public static final String OS_WINDOWS_7 = "Windows 7";
	
	/** Represents the BASE_RECORD_10 field */
	public static final int BASE_RECORD_10 = 10;
	
	/** Represents the DOMAIN_PREFIX_NAME field */
	public static final String DOMAIN_PREFIX_NAME = "www.";
	
	/** Represents the DOMAIN_SUFFIX_NAME_COM field */
	public static final String DOMAIN_SUFFIX_NAME_COM = ".com";
	
	/** Represents the DOMAIN_SUFFIX_NAME_NET field */
	public static final String DOMAIN_SUFFIX_NAME_NET = ".net";
	
	/** Represents the HTML_SUFFIX_NAME field */
	public static final String HTML_SUFFIX_NAME = ".html";
	
	/** Represents the HTML_PREFIX_NAME field */
	public static final String HTML_PREFIX_NAME = "http://";
	
	/** Represents the LOCALHOST_NAME field */
	public static final String LOCALHOST_NAME = "localhost";
	
}
