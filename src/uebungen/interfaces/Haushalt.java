package uebungen.interfaces;

import uebungen.interfaces.Haushaltssteckdose.Haushaltssteckdose;
import uebungen.interfaces.Stromerzeuger.EVU;
import uebungen.interfaces.Stromerzeuger.EVUenum;
import uebungen.interfaces.Stromerzeuger.Stromvertrag;

public class Haushalt {

	public static void main(String[] args) {
		Stromvertrag vertrag = new Stromvertrag(EVUenum.AKW); //Vertragsanbieter
		EVU evu = vertrag.getAnbieter();
		Haushaltssteckdose hd1=evu; //Hauinstallation
		Fön f=new Fön();
		f.einstecken(hd1);
		System.out.println(f.fönnen());
	}
}
