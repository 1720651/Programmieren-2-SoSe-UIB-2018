package uebungen.IOHandling.FileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("/test/test.txt");
		FileOutputStream out = new FileOutputStream("/test/test2.txt");
		int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}
		in.close();
		out.close();
	}

}
