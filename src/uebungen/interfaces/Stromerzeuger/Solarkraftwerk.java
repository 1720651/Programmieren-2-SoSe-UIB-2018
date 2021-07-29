package uebungen.interfaces.Stromerzeuger;

import uebungen.interfaces.Haushaltsstrom;
import uebungen.interfaces.Industriestrom;

public class Solarkraftwerk extends EVU{
	
	@Override
	public Haushaltsstrom getHaushaltsstrom() {
		System.out.println("Nimm ein paar Sonnenstrahlen, erzeuge Haushaltsstrom");
		Haushaltsstrom s = new Haushaltsstrom();
		return s;
	}
	
	@Override
	public Industriestrom getIndustriestrom() {
		System.out.println("Nimm ein paar Sonnenstrahlen, erzeuge Industriestrom");
		Industriestrom s = new Industriestrom();
		return s;
	}

}
