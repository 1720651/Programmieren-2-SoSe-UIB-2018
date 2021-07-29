package uebungen.IOHandling.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Outputstream {

	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("/test/test.txt");
		byte[] daten = { 'A', 'B', 'C'};
		fos.write(daten);
		fos.close();
	}

}
