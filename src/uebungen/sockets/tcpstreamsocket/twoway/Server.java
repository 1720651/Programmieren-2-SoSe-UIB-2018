package uebungen.sockets.tcpstreamsocket.twoway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket s = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			System.out.println("Server starting ...");
			server = new ServerSocket(1234);
			s = server.accept();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = in.readLine();
			System.out.println("income message: " + text);
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String text2 = "SERVER: "+text;
			System.out.println("Outgoing message: "+text2);
			out.write(text2);
			out.newLine();
			out.flush();
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
