package uebungen.graphen.dijkstra;

import java.util.ArrayList;

class Knoten {
	private int inhalt; // Kunden abh�ngig
	private ArrayList<Kante> kantenListe = new ArrayList<Kante>();
	private int distanz;
	private Knoten vorg�nger=null;
	
	
	// Konstruktor
	public Knoten(int i) {
		setInhalt(i);
	}

	// Methoden
	
	public int getGrad() {
		return this.kantenListe.size();
	}
	
	public void addKante(Kante k) {
		if(k==null) throw new RuntimeException("Ung�ltige Kante!");
		this.kantenListe.add(k);
	}
	
	public ArrayList<Knoten> getNachbarKnoten() {
		ArrayList<Knoten> nachbarn = new ArrayList <Knoten>();
		if (getKantenListe()==null) return null;
		for(Kante k:getKantenListe()) {
			 nachbarn.add(k.getAnderesEnde(this));
		}
		return nachbarn;
	}
	
	
	
	
	// Getter und Setter

	public int getInhalt() {
		return inhalt;
	}

	public void setInhalt(int inhalt) {
		this.inhalt = inhalt;
	}

	public ArrayList<Kante> getKantenListe() {
		return kantenListe;
	}

	public void setKantenListe(ArrayList<Kante> kantenListe) {
		this.kantenListe = kantenListe;
	}
	
	public int getDistanz() {
		return this.distanz;
	}

	public void setDistanz(int distanz) {
		this.distanz = distanz;
	}
	
	public Knoten getVorg�nger() {
		return this.vorg�nger;
	}

	public void setVorg�nger(Knoten vorg�nger) {
		this.vorg�nger = vorg�nger;
	}
	
	
	@Override
	public String toString() {
		return "" + getInhalt();
	}
}
