package uebungen.sockets.tcpstreamsocket.endlos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
	private ServerSocket server=null;
	private Socket s=null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	private Server() {
		try {
			while(true) {
				System.out.println("Server starting ...");
				server = new ServerSocket(1234);
				s = server.accept();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String text = in.readLine();
				System.out.println("Imcome Message: "+text);
				out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				String text2 = "SERVER: "+text;
				System.out.println("Outgoing Message"+text2);
				out.write(text2);
				out.newLine();
				out.flush();
				terminate();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			terminate();
		}
	}
	
	private void terminate() {
		System.out.println("Server terminated.");
		try {
			in.close();
		} catch(Exception e) {}
		try {
			out.close();
		} catch(Exception e) {}
		try {
			server.close();
		} catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
