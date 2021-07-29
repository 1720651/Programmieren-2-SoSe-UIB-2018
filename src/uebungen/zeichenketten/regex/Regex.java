package uebungen.zeichenketten.regex;

import java.util.regex.Pattern;

class Regex {
	
	public void matcher() {
		System.out.println(Pattern.matches("'.*","'Hallo'"));
		System.out.println("'Hallo'".matches("'.*'"));
		System.out.println(Pattern.matches("'.*","Hallo"));
	}
	
	
		
}
