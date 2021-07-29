package uebungen.graphen.dijkstra;

import java.util.ArrayList;

class Dijkstra {
	private static Dijkstra instance=null;
	
	// Privater Konstruktor
	private Dijkstra() {}
	
	//Singelton Aufruf und Konstruktor
	public static Dijkstra getInstance() {
			if(instance==null) instance = new Dijkstra();
			return instance;
		}
	
	// Methoden
	private void init(UngerichteterGraphDijkstra graph) {
		ArrayList<Knoten> initKnoten = graph.getKnotenListe();
		for(Knoten k:initKnoten) {
			k.setVorgänger(null);
			k.setDistanz(Integer.MAX_VALUE);
		}
	}
	
	public ArrayList<Knoten> kürzesterWeg(UngerichteterGraphDijkstra graph, int start, int ende){		
			init(graph);
			Knoten startKnoten = graph.getKnoten(start);
			Knoten endKnoten = graph.getKnoten(ende);
			if((startKnoten==null) || (endKnoten==null)) return null;
			if(startKnoten==endKnoten) return null;
			startKnoten.setDistanz(0);
			//WICHTIG DA SONST NUR REFERENZ UMGEBOGEN WIRD;
			ArrayList<Knoten> Q = new ArrayList<Knoten>();
			Q.addAll(graph.getKnotenListe());
			do {
				Knoten gewählt=null;
				for(Knoten x:Q) {
					if(gewählt==null) gewählt=x;
					if(gewählt.getDistanz()>x.getDistanz()) gewählt=x;
				}
				Q.remove(gewählt);
				for(Kante ka:gewählt.getKantenListe()) {
					Knoten knD = ka.getAnderesEnde(gewählt);
					if(Q.contains(knD)) {
						if(gewählt.getDistanz()+ka.getDistanz()<knD.getDistanz()) {
							knD.setDistanz(gewählt.getDistanz()+ka.getDistanz());
							knD.setVorgänger(gewählt);
						}
					}
				}
			} while(Q.size()>0);
			ArrayList<Knoten> aus=new ArrayList<Knoten>();
			Knoten x = endKnoten;
			do {
				aus.add(0, x);
				x=x.getVorgänger();
			} while(x!=null);
			return aus;
		}
		
}
