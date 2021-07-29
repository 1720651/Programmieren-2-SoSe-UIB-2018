package uebungen.treesandtries.binarytree;

class Binärbaum {
	Knoten wurzel;
	Knoten links;
	Knoten rechts;
	
	
	public Binärbaum(String wurzel) {
		setWurzel(new Knoten(wurzel));
	}
	
	public void einfügen(String inhalt) {
		if (wurzel==null) setWurzel(new Knoten(inhalt));
		einfügenRekrusion(wurzel, inhalt);
	}
	
	private void einfügenRekrusion(Knoten k, String inhalt) {
		if(k==null) {
			k=new Knoten(inhalt); 
			if(wurzel==null) wurzel=k;
		}
		else {
			if(inhalt.compareTo(k.getInhalt())<0) { //Wenn der Wert Kleiner ist als der Knotenwert
				if(k.getLinks()!=null) {
					einfügenRekrusion(k.getLinks(),inhalt);
				}else {
					k.setLinks(new Knoten(inhalt));
				}
			}
			if(inhalt.compareTo(k.getInhalt())>0) { //Wenn der Wert größer ist als der Knotenwert
				if(k.getRechts()!=null) {
					einfügenRekrusion(k.getRechts(), inhalt);
				} else {
					k.setRechts(new Knoten(inhalt));
				}
			}		
		}
	}
	
	public int getHöhe() {
		if(wurzel==null) return 0;
		return getHöheRekrusion(0, wurzel);
	}
	//LERNEN!
	private int getHöheRekrusion(int akHöhe, Knoten k) {
		if(k!=null) {
			return Math.max(getHöheRekrusion(akHöhe+1, k.getLinks()), getHöheRekrusion(akHöhe+1, k.getRechts()));
		}
		return akHöhe;
	}
	
	public boolean löschen(String inhalt) {
		return löschenRekursion(getWurzel(), inhalt, null, false);
	}
//	LERNEN
	public boolean löschenRekursion(Knoten k, String inhalt, Knoten vater, boolean rechtsVomVater) {
		if(k==null||inhalt==null) return false;
		if(inhalt.compareTo(k.getInhalt())==0) {
			if(k.getLinks()==null && k.getRechts()==null) { //Wenn Blatt ist
				k=null;
			}
			else if(k.getLinks()!=null && k.getRechts()==null) { // Ein Kind links
				if(rechtsVomVater) {
					vater.setRechts(k.getLinks());
				} else {
					vater.setLinks(k.getLinks());
				}
				return true;
			}
			else if(k.getLinks()==null && k.getRechts()!=null) { // Ein Kind rechts
				if(rechtsVomVater) {
					vater.setRechts(k.getRechts());
				} else {
					vater.setLinks(k.getRechts());
				}
				return true;
			}
			else if(k.getLinks()!=null && k.getRechts()!=null) { // 2 Kinder
				Knoten x = getKleinster(k.getRechts()); //Von R den < Kl.
				System.out.println("X: "+x);
				//vater = getGrößte(k.getLinks()); //Von L den > Gr.
				löschen(x.getInhalt());
				if(vater==null) { //Wenn man zufällig die Wurzel löscht
					x.setLinks(wurzel.getLinks());
					x.setRechts(wurzel.getRechts());
					setWurzel(x);
				} else {
					x.setLinks(k.getLinks());
					x.setRechts(k.getRechts());
					if(rechtsVomVater) {
						vater.setRechts(k);
					} else {
						vater.setLinks(k);
					}
				}
				return true;
			}
		}
		if(inhalt.compareTo(k.getInhalt())>0) { //Wert>Knotenwert
			löschenRekursion(k.getRechts(), inhalt, k, true);
		}
		if(inhalt.compareTo(k.getInhalt())<0) { //Wert<Knotenwert
			löschenRekursion(k.getLinks(), inhalt, k, false);
		}
		return false;
	}
	
	public String getKleinster() {
		if(this.wurzel==null) return null;
		return getKleinster(wurzel).getInhalt();
	}
	
	private Knoten getKleinster(Knoten k) {
		if(k!=null) {
			while(k.getLinks()!=null) {
				k=k.getLinks();
			}
		}
		return k;
	}
	
	public String getGrößte() {
		if(this.wurzel==null) return null;
		return getGrößte(wurzel).getInhalt();
	}
	
	private Knoten getGrößte(Knoten k) {
		if(k!=null) {
			while(k.getRechts()!=null) {
				k=k.getRechts();
			}
		}
		return k;		
	}
	
	public String inOrderAusgabe() {
		return inOrderRekursion(wurzel);
	}
	
	private String inOrderRekursion(Knoten k) {
		String s = "";
		if(k==null) return "<leer>";
		//L
		if(k.getLinks()!=null)
			s+=inOrderRekursion(k.getLinks());
		//W
		s+=k.getInhalt()+" ";
		//R
		if(k.getRechts()!=null)
			s+=inOrderRekursion(k.getRechts());
		return s;
	}
	
	public String postOrderAusgabe() {
		return postOrderRekursion(wurzel);
	}
	
	private String postOrderRekursion(Knoten k) {
		String s = "";
		if(k==null) return "<leer>";
		//L
		if(k.getLinks()!=null)
			s+=postOrderRekursion(k.getLinks());
		//R
		if(k.getRechts()!=null)
			s+=postOrderRekursion(k.getRechts());		
		//W
		s+=k.getInhalt()+" ";
		return s;
	}
	
	public Knoten getKnoten(String inhalt) {
		return getKnotenRekursion(wurzel, inhalt);
	}
	
	private Knoten getKnotenRekursion(Knoten k, String inhalt) {
		if(k==null) return null;
		if(inhalt.compareTo(k.getInhalt())==0) return k; //gefunden
		if(inhalt.compareTo(k.getInhalt())<0)  return getKnotenRekursion(k.getLinks(), inhalt); //links weiter suchen
		if(inhalt.compareTo(k.getInhalt())>0)  return getKnotenRekursion(k.getRechts(), inhalt); //rechts weiter suchen
		return null;
	}

	//Getter und Setter
	public Knoten getWurzel() {
		return wurzel;
	}


	public void setWurzel(Knoten wurzel) {
		this.wurzel = wurzel;
	}


	public Knoten getLinks() {
		return links;
	}


	public void setLinks(Knoten links) {
		this.links = links;
	}


	public Knoten getRechts() {
		return rechts;
	}


	public void setRechts(Knoten rechts) {
		this.rechts = rechts;
	}
	
	
}
