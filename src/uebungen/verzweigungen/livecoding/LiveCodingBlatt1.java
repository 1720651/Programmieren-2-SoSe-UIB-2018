package uebungen.verzweigungen.livecoding;

import java.util.Scanner;

class LiveCodingBlatt1 {

	public static void main(String[] args) {
		LiveCodingBlatt1 live = new LiveCodingBlatt1();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] array = { {}, { 30 }, null, { 15, 15, 5 }, { 4 }, {} };
		//int[][] array = {null, null};

		int eingabe = 5;
		while (true) {
			System.out.println("Was möchten sie für eine Schleife benutzen ?");
			switch (sc.nextLine()) {
			case "for":
				live.getAnzahlTeilbarDurchFor(array, eingabe);
				break;
			case "foreach":
				live.getAnzahlTeilbarDurchForEach(array, eingabe);
				break;
			case "while":
				live.getAnzahlTeilbarDurchWhile(array, eingabe);
				break;
			}
		}
	}

	public void getAnzahlTeilbarDurchFor(int[][] array, int eingabe) {
		int anzahlTeilbar = 0;
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != null && array.length != 0) {
					for (int j = 0; j < array[i].length; j++) {
						if (array[i][j] % eingabe == 0)
							anzahlTeilbar++;
					}
				}
			}
		}
		System.out.println("In dem Array sind " + anzahlTeilbar + " Zahlen Teilbar durch ihre Eingabe!");
	}

	public void getAnzahlTeilbarDurchForEach(int[][] array, int eingabe) {
		int anzahlTeilbar = 0;
		if (array != null) {
			for (int[] a2d : array) {
				if (a2d != null) {
					for (int zahl : a2d) {
						if (zahl % eingabe == 0)
							anzahlTeilbar++;
					}
				}

			}
		}
		System.out.println("In dem Array sind " + anzahlTeilbar + " Zahlen Teilbar durch ihre Eingabe!");
	}

	public void getAnzahlTeilbarDurchWhile(int[][] array, int eingabe) {
		int anzahlTeilbar = 0;
		if (array != null) {
			int i = 0;
			while (i < array.length) {
				if (array[i] != null && array[i].length != 0) {
					int j = 0;
					while (j < array[i].length) {
						if(array[i][j]%eingabe==0) anzahlTeilbar++;
						j++;
					}
				}
				i++;
			}
		}
		System.out.println("In dem Array sind " + anzahlTeilbar + " Zahlen Teilbar durch ihre Eingabe!");
	}
}
