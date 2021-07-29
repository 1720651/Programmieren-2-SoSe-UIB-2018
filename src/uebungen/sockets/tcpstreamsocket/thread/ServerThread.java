package uebungen.sockets.tcpstreamsocket.thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

class ServerThread extends Thread {
	private Socket s = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public ServerThread(Socket s) {
		System.out.println("Connection Established.");
		this.s = s;
	}

	@Override
	public void run() {
		try {
			System.out.println("Server incoming request...");
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = in.readLine();
			System.out.println("Incoming message: " + text);
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String text2 = "SERVER: " + text;
			System.out.println("Outgoing Message: " + text2);
			out.write(text2);
			out.newLine();
			out.write("HALLO");
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			terminate();
		}
	}

	private void terminate() {
		System.out.println("Connection terminated.");
		try {
			in.close();
		} catch (Exception e) {
		}
		try {
			out.close();
		} catch (Exception e) {
		}
	}
}
