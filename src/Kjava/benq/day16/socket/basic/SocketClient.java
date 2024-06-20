package Kjava.benq.day16.socket.basic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		// 연결 시도
		String address = "127.0.0.1"; // local 환경(개인)
		int port = 8888; // SocketServer port와 일치해야 함
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
