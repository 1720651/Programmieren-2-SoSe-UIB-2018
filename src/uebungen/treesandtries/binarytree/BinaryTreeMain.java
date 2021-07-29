package uebungen.treesandtries.binarytree;

class BinaryTreeMain {

	public static void main(String[] args) {
		Bin�rbaum t = new Bin�rbaum("Dopatka");
		t.einf�gen("Meier");
		t.einf�gen("Schmidt");
		t.einf�gen("Arenson");
		t.einf�gen("M�ller");
		t.einf�gen("Wusserow");
		t.einf�gen("Schulz");
		System.out.println("H�he : "+t.getH�he());
		System.out.println("///////////////////////////////");
		System.out.println(t.inOrderAusgabe());
		System.out.println(t.postOrderAusgabe());
		System.out.println(t.l�schen("Dopatka"));
		System.out.println(t.inOrderAusgabe());
		System.out.println("///////////////////////////////");
		System.out.println(t.postOrderAusgabe());
		System.out.println("///////////////////////////////");
		System.out.println(t.getGr��te());
		System.out.println("///////////////////////////////");
		System.out.println(t.getKleinster());
		System.out.println("///////////////////////////////");
		System.out.println(t.getKnoten("Meier"));
		System.out.println("L:"+t.getKnoten("Meier").getLinks());
		System.out.println("R:"+t.getKnoten("Meier").getRechts());
		System.out.println("///////////////////////////////");


	}

}
