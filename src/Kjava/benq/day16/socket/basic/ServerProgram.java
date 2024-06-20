package Kjava.benq.day16.socket.basic;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			Socket socket = serverSocket.accept(); // 연결 요청 기다리는 중
			System.out.println("클라이언트와 연결되었습니다.");
//			socket.getOutputStream(); // Server -> Client
			InputStream is = socket.getInputStream(); // Client -> Server
			is = socket.getInputStream();
			int result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
