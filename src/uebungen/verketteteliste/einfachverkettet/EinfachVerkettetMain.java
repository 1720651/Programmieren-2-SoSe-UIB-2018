package uebungen.verketteteliste.einfachverkettet;

class EinfachVerkettetMain {

	public static void main(String[] args) {
		
		EinfachVerketteteListe list = new EinfachVerketteteListe(3);
		list.add("Test");
		list.add("Test2");
		list.add("Test3");
		System.out.println("getFirst : " + list.getFirst());
		System.out.println("getLast : " + list.getLast());
		System.out.println("Get Index : " + list.get(3));
		Object[] con = list.getAll();
		for(Object o:con) {
			System.out.println(o);
		}
		System.out.println("/////////////////////////////");
		list.remove(1);
		System.out.println("getFirst : " + list.getFirst());
		System.out.println("getLast : " + list.getLast());
		System.out.println("Get Index : " + list.get(2));
		Object[] con2 = list.getAll();
		for(Object o:con2) {
			System.out.println(o);
		}
	}

}
