package uebungen.sockets.tcpstreamsocket.endlos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

class Client {
	
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			System.out.println("Client starting...");
			String x = "Hallo?";
			s = new Socket("localhost", 1234);
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			System.out.println("Client sends '"+x+"'...");
			out.write(x);
			out.newLine();
			out.flush();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = in.readLine();
			System.out.println(text);
			System.out.println("Client terminated.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch(Exception e) {};
			try {
				out.close();
			} catch(Exception e) {}
		}
	}
}
