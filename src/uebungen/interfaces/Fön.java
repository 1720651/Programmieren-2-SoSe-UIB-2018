package uebungen.interfaces;

import uebungen.interfaces.Haushaltssteckdose.Haushaltssteckdose;

public class F�n {
	private Haushaltssteckdose dose;
	
	public void einstecken(Haushaltssteckdose dose) {
		this.dose = dose;
	}
	
	public void ausstecken() {
		this.dose=null;
	}
	
	@SuppressWarnings("unused")
	public HeisseLuft f�nnen() {
		Haushaltsstrom s = dose.getHaushaltsstrom();
		System.out.println("Wandle den Strom s in HeisseLuft um und pusste ihne raus");
		return new HeisseLuft();
	}
}
