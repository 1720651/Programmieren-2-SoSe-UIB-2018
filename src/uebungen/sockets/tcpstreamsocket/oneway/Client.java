package uebungen.sockets.tcpstreamsocket.oneway;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

class Client {
	
	public static void main(String[] args) {
		Socket s = null;
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
			System.out.println("Client terminated.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch(Exception e) {}
		}
	}
}
