package uebungen.graphen.färbung;

class Kante {
	private Knoten k1=null;
	private Knoten k2=null;
	
//	Konstruktor
	public Kante(Knoten k1, Knoten k2) {
		setK1(k1);
		setK2(k2);
		this.k1.addKante(this);
		this.k2.addKante(this);
	}

//	Methoden
	public Knoten getAnderesEnde(Knoten k) {
		if(getK1()==k) return getK2();
		else return getK1();
	}
	
	
	
//	Getter und Setter
	public Knoten getK1() {
		return k1;
	}

	public void setK1(Knoten k1) {
		this.k1 = k1;
	}

	public Knoten getK2() {
		return k2;
	}

	public void setK2(Knoten k2) {
		this.k2 = k2;
	}
	
}
