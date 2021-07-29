package uebungen.graphen.dijkstra;

import java.util.ArrayList;

class UngerichteterGraphDijkstra {
	private ArrayList<Knoten> knoten = new ArrayList<Knoten>();

	// Konstruktor
	public UngerichteterGraphDijkstra() {
	}

	// Methoden
	public void addKnoten(Knoten k) {
		if (k == null)
			throw new RuntimeException("addKnoten: Ungültiger Knoten!");
		knoten.add(k);
	}

	public boolean hatKnoten(Knoten k) {
		if (k == null)
			return false;
		for (Knoten kn : getKnotenListe()) {
			if (k == kn)
				return true;
		}
		return false;
	}

	public int getAnzKnoten() {
		return getKnotenListe().size();
	}

	public int getGrad() {
		int grad = 0;
		for (Knoten k : getKnotenListe()) {
			if (k.getGrad() > grad)
				grad = k.getGrad();
		}
		return grad;
	}

	public Knoten getKnoten(int i) {
		for(Knoten k:getKnotenListe()) {
			if(i==k.getInhalt()) return k;
		}
		return null;
	}
		
	
	// Getter und Setter

	public ArrayList<Knoten> getKnotenListe() {
		return knoten;
	}

	// Graphen kopieren
	public void setKnoten(ArrayList<Knoten> knoten) {
		this.knoten = knoten;
	}

}
