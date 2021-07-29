package uebungen.graphen.ungerichtetergraph;

class UngerichteterGraphMain {

	public static void main(String[] args) {
		//Graph und Knoten
		UngerichteterGraph g = new UngerichteterGraph();
		for(int i=1;i<=8;i++) g.addKnoten(new Knoten(i));
		//Kanten Hinzufügen
		new Kante(g.getKnoten(1), g.getKnoten(2));
		new Kante(g.getKnoten(1), g.getKnoten(4));
		new Kante(g.getKnoten(1), g.getKnoten(5));
		new Kante(g.getKnoten(4), g.getKnoten(5));
		new Kante(g.getKnoten(5), g.getKnoten(6));
		new Kante(g.getKnoten(6), g.getKnoten(8));
		new Kante(g.getKnoten(8), g.getKnoten(7));
		
		System.out.println("Grad Graph: " + g.getGrad());
		Knoten k=g.getKnoten(2);
		System.out.println("Grad Knoten 2 " + k.getGrad());

	}

}
