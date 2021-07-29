package uebungen.graphen.dijkstra;

import java.util.ArrayList;

class UngerichteterGraphDijkstraMain {

	public static void main(String[] args) {
		//Graph und Knoten
		UngerichteterGraphDijkstra g = new UngerichteterGraphDijkstra();
		for(int i=1;i<=8;i++) g.addKnoten(new Knoten(i));
		//Kanten Hinzufügen
		new Kante(g.getKnoten(1), g.getKnoten(2), 8);
		new Kante(g.getKnoten(2), g.getKnoten(3), 4);
		new Kante(g.getKnoten(3), g.getKnoten(4), 2);
		new Kante(g.getKnoten(4), g.getKnoten(5), 2);
		new Kante(g.getKnoten(5), g.getKnoten(6), 4);
		new Kante(g.getKnoten(6), g.getKnoten(8), 4);
		new Kante(g.getKnoten(8), g.getKnoten(7), 2);
		new Kante(g.getKnoten(7), g.getKnoten(3), 1);
		new Kante(g.getKnoten(1), g.getKnoten(6), 20);
		Dijkstra alg = Dijkstra.getInstance();
		ArrayList<Knoten> weg=alg.kürzesterWeg(g, 1, 6);
		System.out.println("Kürzester Weg: " + weg);
		System.out.println(g.getKnoten(6).getDistanz());

	}

}
