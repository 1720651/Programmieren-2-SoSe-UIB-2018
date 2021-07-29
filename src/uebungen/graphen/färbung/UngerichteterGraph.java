package uebungen.graphen.färbung;

import java.util.ArrayList;

class UngerichteterGraph {
	private ArrayList<Knoten> knoten = new ArrayList<Knoten>();

	// Konstruktor
	public UngerichteterGraph() {
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
	
	public int getAnzFarben() {
		int max=0;
		for(Knoten kn:getKnotenListe()) {
			if(max<kn.getFarbe()) max=kn.getFarbe();
		}
		return max;
	}
	
	public void färben() {
		for(Knoten kn:getKnotenListe()) {
			kn.setFarbe(kn.getNächsterFreieFarbe());
		}
	}
	
	public String getSchedule() {
		int farben=getAnzFarben();
		String aus[]=new String[farben];
		for(int i=0;i<farben;i++) aus[i]="";
		String ausgabe="";
		for(Knoten kn:getKnotenListe()) {
			aus[kn.getFarbe()-1]+=kn.getInhalt()+" ";
		}
		for(int i=0;i<farben;i++) ausgabe+="Slot "+(i+1)+": "+aus[i]+"\n";
		return ausgabe;
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
