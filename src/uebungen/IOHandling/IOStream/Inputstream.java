package uebungen.IOHandling.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Inputstream {

	public static void main(String[] args) throws IOException {
		InputStream fis =new FileInputStream("/test/test.txt");
		int daten;
		while((daten = fis.read()) != -1) {
			byte b = (byte) daten;
			System.out.println((char) b);
		}
		fis.close();

	}

}
