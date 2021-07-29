package uebungen.treesandtries.binarytree;

class Knoten {
	
	private String inhalt=null;
	private Knoten links=null;
	private Knoten rechts=null;
	private boolean markiert=false;
	
	public Knoten(String inhalt) {
		setInhalt(inhalt);
	}
	
	public String getInhalt() {
		return this.inhalt;
	}
	
	public Knoten getLinks() {
		return this.links;
	}
	
	public Knoten getRechts() {
		return this.rechts;
	}
	
	public boolean getMarkiert() {
		return this.markiert;
	}
	//
	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	
	public void setLinks(Knoten links) {
		this.links = links;
	}
	
	public void setRechts(Knoten rechts) {
		this.rechts = rechts;
	}
	
	public void setMarkiert(boolean markiert) {
		this.markiert = markiert;
	}
	
	@Override
	public String toString() {
		if(this.getInhalt()==null) return null;
		return getInhalt().toString();
	}
	
	
	
}
