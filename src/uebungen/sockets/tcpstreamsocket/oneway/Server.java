package uebungen.sockets.tcpstreamsocket.oneway;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class Server {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket s = null;
		BufferedReader in = null;
		try {
			System.out.println("Server starting ...");
			server = new ServerSocket(1234);
			s = server.accept();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = in.readLine();
			System.out.println("income message: " + text);
			System.out.println("Server terminated.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
			try {
				server.close();
			} catch (Exception e) {
			}
		}

	}

}
