package uebungen.verketteteliste.einfachverkettet;

class EinfachVerketteteListe {
	private Knoten wurzel;
	
	public EinfachVerketteteListe(Object o){
		if(o==null) throw new RuntimeException("Die Liste kann nicht mit null initialisiert werden!");
		setWurzel(o);
	}
	
	//Getter und Setter
	public Knoten getWurzel() {
		return wurzel;
	}

	public void setWurzel(Object inhalt) {
		this.wurzel = new Knoten(inhalt, null);
	}
	
	public boolean add(Object o) {
		if(getWurzel()==null) {
			setWurzel(new Knoten(o, null));
			return true;
		}
		Knoten last = getLastKnoten();
		last.setNext(new Knoten(o, null));
		return true;
	}
	
	public void remove(int pos) {
		if((getWurzel()==null) ||( (pos<1) || (pos>getAnzahlKnoten()))) throw new RuntimeException("Position ungültig!");
		if(pos==1) {
			this.wurzel = getWurzel().getNext(); return;
		}
		Knoten before = null;
		Knoten k= getWurzel();
		for(int i = 1; i<pos;i++) {
			before=k;
			k=k.getNext();
		}
		//k löschen
		before.setNext(k.getNext());
	}

	
	
	public Object getFirst() {
		if (getWurzel() == null) return null;
		return getWurzel().getO();
	}
	
	public Object getLast() {
		return getLastKnoten();
	}
	
	private Knoten getLastKnoten() {
		if(getWurzel()==null) return null;
		Knoten k = getWurzel();
	while(k.getNext()!=null) {
			k = k.getNext();
		}
		return k;
	}
	
	public Object get(int pos) {
		if((pos<1) || (pos>getAnzahlKnoten())) throw new RuntimeException("Position ungültig!");
		if(getWurzel()==null) throw new RuntimeException("NullpointerException!");
		Knoten search = getWurzel();
		for(int i = 1; i<pos;i++) {
			search = search.getNext();
		}
		return search.getO();
	}
	
	public int size() {
		return 0;
	}
	
	public Object[] getAll() {
		Object[] container = new Object[getAnzahlKnoten()];
		Knoten tmp = getWurzel();
		for(int i = 0; i<container.length;i++) {
			container[i] = tmp;
			tmp = tmp.getNext();
		}
		return container;
	}
	
	public int getAnzahlKnoten() {
	if(getWurzel()==null) return 0;
	Knoten k=getWurzel();
	Knoten next;
	int anzahl=0;
	do {
		next=k.getNext();
		k=next;
		anzahl++;
	}while(next!=null);
	return anzahl;
	}
}
