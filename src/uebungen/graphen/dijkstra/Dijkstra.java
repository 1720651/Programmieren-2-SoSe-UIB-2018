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
			k.setVorg�nger(null);
			k.setDistanz(Integer.MAX_VALUE);
		}
	}
	
	public ArrayList<Knoten> k�rzesterWeg(UngerichteterGraphDijkstra graph, int start, int ende){		
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
				Knoten gew�hlt=null;
				for(Knoten x:Q) {
					if(gew�hlt==null) gew�hlt=x;
					if(gew�hlt.getDistanz()>x.getDistanz()) gew�hlt=x;
				}
				Q.remove(gew�hlt);
				for(Kante ka:gew�hlt.getKantenListe()) {
					Knoten knD = ka.getAnderesEnde(gew�hlt);
					if(Q.contains(knD)) {
						if(gew�hlt.getDistanz()+ka.getDistanz()<knD.getDistanz()) {
							knD.setDistanz(gew�hlt.getDistanz()+ka.getDistanz());
							knD.setVorg�nger(gew�hlt);
						}
					}
				}
			} while(Q.size()>0);
			ArrayList<Knoten> aus=new ArrayList<Knoten>();
			Knoten x = endKnoten;
			do {
				aus.add(0, x);
				x=x.getVorg�nger();
			} while(x!=null);
			return aus;
		}
		
}
