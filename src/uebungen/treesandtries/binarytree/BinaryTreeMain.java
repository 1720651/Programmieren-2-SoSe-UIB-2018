package uebungen.treesandtries.binarytree;

class BinaryTreeMain {

	public static void main(String[] args) {
		Binärbaum t = new Binärbaum("Dopatka");
		t.einfügen("Meier");
		t.einfügen("Schmidt");
		t.einfügen("Arenson");
		t.einfügen("Müller");
		t.einfügen("Wusserow");
		t.einfügen("Schulz");
		System.out.println("Höhe : "+t.getHöhe());
		System.out.println("///////////////////////////////");
		System.out.println(t.inOrderAusgabe());
		System.out.println(t.postOrderAusgabe());
		System.out.println(t.löschen("Dopatka"));
		System.out.println(t.inOrderAusgabe());
		System.out.println("///////////////////////////////");
		System.out.println(t.postOrderAusgabe());
		System.out.println("///////////////////////////////");
		System.out.println(t.getGrößte());
		System.out.println("///////////////////////////////");
		System.out.println(t.getKleinster());
		System.out.println("///////////////////////////////");
		System.out.println(t.getKnoten("Meier"));
		System.out.println("L:"+t.getKnoten("Meier").getLinks());
		System.out.println("R:"+t.getKnoten("Meier").getRechts());
		System.out.println("///////////////////////////////");


	}

}
