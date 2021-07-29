package uebungen.IOHandling.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {
	
	public static void main(String[] args) throws IOException {
		String dateinname = "/test/test.txt";
		BufferedReader reader = new BufferedReader(new FileReader(dateinname));
		String laden;
		while((laden = reader.readLine()) != null) {
			System.out.println(laden);
		}
		reader.close();
	}
}
