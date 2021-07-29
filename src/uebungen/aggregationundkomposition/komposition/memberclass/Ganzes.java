package uebungen.aggregationundkomposition.komposition.memberclass;

import java.util.ArrayList;

public class Ganzes {
	private ArrayList<Teil> teile = new ArrayList<Teil>();
	
	public Ganzes() {
		for(int i=1;i<=5;i++) {
			teile.add(new Teil());
		}
	}
	
	public class Teil {
		public Teil() {
			
		}
	}
}
