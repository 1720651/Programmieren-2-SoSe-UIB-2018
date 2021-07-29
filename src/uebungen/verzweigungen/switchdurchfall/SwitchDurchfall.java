package uebungen.verzweigungen.switchdurchfall;

class SwitchDurchfall {
	
	public SwitchDurchfall() {}
	
	public void fallThroughtUnpassend() {
		int x = 3;
		switch(x) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		default:
			System.out.println("Passt nicht!");
		}
	}
	
	public void fallThroughtPassend() {
		char testVokal='a';
		switch(testVokal) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(testVokal+" ist Vokal"); break;
		default:
			System.out.println(testVokal+" ist kein Vokal");
		}
	}
	
	public static void main(String[] args) {
		SwitchDurchfall sw = new SwitchDurchfall();
		sw.fallThroughtUnpassend();
		sw.fallThroughtPassend();
	}
}


