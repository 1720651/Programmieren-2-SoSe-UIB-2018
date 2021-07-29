package uebungen.allesisteinobject.basismethodenueberschreiben;

class mainStudent {

	public static void main(String[] args) {
		Student m1 = new Student("Rik", "Wachner", 1720651);
		Student m2 = new Student("Rik", "Wachner", 1723345);
		Mensch m3 = new Student("Freddy", "Jester", 1720651);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1);
	}

}
