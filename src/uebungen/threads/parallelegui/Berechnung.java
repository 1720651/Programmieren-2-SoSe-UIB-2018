package uebungen.threads.parallelegui;

class Berechnung extends Thread {
	private boolean setAbbruch=false;
	private boolean istFertig=false;
	private GUIThread gui=null;
	
	public void start(GUIThread gui) {
		this.gui=gui;
		super.start();
	}
	
	public void run() {
		gui.addText("Berechnung startet...");
		for(int i=0;i<500000000;i++) {
			for(int j=0;j<100000;j++) {
				if(setAbbruch) {
					gui.addText("ABBRUCH!");
					return;
				}
			}
		}
		gui.addText("Berechnung fertig!");
		istFertig=true;
	}
	
	public void abbrechen() {
		this.setAbbruch=true;
	}
	
	public boolean istFertig() {
		return istFertig;
	}
}
