package uebungen.IOHandling.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrntWriter {

	public static void main(String[] args) throws IOException {
		PrintWriter pw;
		pw = new PrintWriter(new FileWriter("/test/test3.txt"));
		pw.write("Test;Hallo;Wiegehts");
		pw.write("Test;Halsdaslo;Wiegehts");
		pw.println("Test;Hallo;Wiegefdsfsdhts");
		pw.println("PRINTLN");
		pw.println("PRINTLN");
		pw.flush();
		pw.close();
	}

}
