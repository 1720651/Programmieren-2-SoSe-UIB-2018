package uebungen.interfaces.Stromerzeuger;

public class Stromvertrag {
	private EVU anbieter;
	
	public Stromvertrag(EVUenum akw) {
		erstelleVertrag(akw);
	}

	public EVU erstelleVertrag(EVUenum evu) {
		switch(evu) {
		case AKW:
			anbieter = new AKW(); break;
		case Solakrafwerk:
			anbieter = new Solarkraftwerk(); break;
		}
		return anbieter;
	}
	
	public EVU getAnbieter() {
		return anbieter;
	}
}
