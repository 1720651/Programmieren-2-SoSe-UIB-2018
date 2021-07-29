package uebungen.sockets.tcpstreamsocket.thread;

import java.net.ServerSocket;

class Server {
	private ServerSocket server = null;
	
	private Server() {
		try {
			System.out.println("Server starting...");
			server = new ServerSocket(1234);
			while(true) {
				ServerThread th=new ServerThread(server.accept());
				th.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Server terminated.");
			try {
				server.close();
			} catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
