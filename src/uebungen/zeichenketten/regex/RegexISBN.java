package uebungen.zeichenketten.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexISBN {
	
	public static void main(String[] args) {
		String isbn = "978-3-86680-192-9";
		String regex = "((978)|(979))-\\d-\\d+-\\d{3}-\\d";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(isbn);
		System.out.println(m.matches());
	}
}
