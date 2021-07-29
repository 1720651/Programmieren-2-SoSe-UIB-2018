package uebungen.zeichenketten.basics;

class StringEigenschaften {
	
	public int compare(String s1, String s2) {
		if(s1==null||s2==null) throw new RuntimeException("String darf nicht null sein!");
		return s1.compareTo(s2);
		// < 0, wenn s1 alphabetisch vor s2 ist !
		// = 0, wenn s1 alphabetisch gleich s2 ist !
		// > 0, wenn s1 alphabetisch nach s2 ist !
	}
	
	public String stringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("Zusammenfügen: ");
		sb.append('A');
		//sb.append("\t");	
		sb.append('B');
		//sb.append("\t");	
		sb.append('C');
		return sb.toString();
	}
	
	public String stringConverter(char[] array) {
		String s = new String(array);
		return s;
	}
	
	public char[] charConverter(String str) {
		return str.toCharArray();
	}
	 
	
}
