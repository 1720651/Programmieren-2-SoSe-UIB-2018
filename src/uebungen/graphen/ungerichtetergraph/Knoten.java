package uebungen.graphen.ungerichtetergraph;

import java.util.ArrayList;

class Knoten {
	private int inhalt; // Kunden abhängig
	private ArrayList<Kante> kantenListe = new ArrayList<Kante>();

	// Konstruktor
	public Knoten(int i) {
		setInhalt(i);
	}

	// Methoden
	
	public int getGrad() {
		return this.kantenListe.size();
	}
	
	public void addKante(Kante k) {
		if(k==null) throw new RuntimeException("Ungültige Kante!");
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
	
	
	@Override
	public String toString() {
		return "" + getInhalt();
	}
}
