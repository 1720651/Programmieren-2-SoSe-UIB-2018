package uebungen.verketteteliste.einfachverkettet;

class Knoten {
	private Object o;
	private Knoten next;
	
	public Knoten(Object o, Knoten next) {
		setO(o);
		setNext(next);
	}

	public Knoten getNext() {
		return this.next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}
	
	@Override
	public String toString() {
		if(o==null) return "null";
		return o.toString();
	}
	
}
