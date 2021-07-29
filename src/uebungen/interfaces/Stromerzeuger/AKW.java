package uebungen.interfaces.Stromerzeuger;

import uebungen.interfaces.Haushaltsstrom;
import uebungen.interfaces.Industriestrom;

public class AKW extends EVU{

	@Override
	public Haushaltsstrom getHaushaltsstrom() {
		System.out.println("Nimm ein paar richtige Atome, erzeuge Haushaltsstrom");
		Haushaltsstrom s = new Haushaltsstrom();
		return s;
	}
	
	@Override
	public Industriestrom getIndustriestrom() {
		System.out.println("Nimm ein paar richtige Atome, erzeuge Industriestrom");
		Industriestrom s = new Industriestrom();
		return s;
		
	}
	
	
}
