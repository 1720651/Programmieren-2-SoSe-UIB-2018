package uebungen.zeichenketten.basics;

class StringEigenschaftenMain {

	public static void main(String[] args) {
		String s1 = "Rik";
		String s2 = "Anton";
		String s4 = "";
		StringEigenschaften st = new StringEigenschaften();
		System.out.println(st.compare(s1, s2));
		System.out.println(st.compare(s2, s1));
		System.out.println(st.compare(s1, s4));
		System.out.println(st.compare(s2, s4));
		System.out.println(st.stringBuilder());
		System.out.println(st.stringConverter(new char[]{'A', 'B', 'C'}));
		char[] testchararray = st.charConverter("TestString123");
		System.out.println(testchararray[3]);
	}

}
