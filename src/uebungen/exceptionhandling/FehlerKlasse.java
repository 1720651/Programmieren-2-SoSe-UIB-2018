package uebungen.exceptionhandling;

class FehlerKlasse {

	public static void main(String[] args) {
		FehlerKlasse thorwclass = new FehlerKlasse();
		try {
			thorwclass.fehlerwerfen();
		} catch (HalmaException e) {
			System.err.println(e);
		}
	}
	
	public Exception fehlerwerfen() throws HalmaException {
		throw new HalmaException("Testfehler", 1);
	}
	//e.getMessage -> Nur das was Super(msg) �bergeben wird
	//e.printStackTrace() -> Kompletter Verlauf
	//toString() �berschreiben -> syso(e) -> Printet die toSting()
}
