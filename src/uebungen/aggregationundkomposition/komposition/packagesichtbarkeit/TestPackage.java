package uebungen.aggregationundkomposition.komposition.packagesichtbarkeit;

import uebungen.aggregationundkomposition.komposition.packagesichtbarkeit.teil.Ganzes;

public class TestPackage {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ganzes g=new Ganzes();
		//Teil t = new Teil(); !!!
	}
}
