package Kjava.benq.practice.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9090;
		// Reader rd = null;
		InputStream is = null;
		DataInputStream dis = null;
		BufferedReader in = null;
		// 문자기반의 보조스트림
		// 전달값은 문자기반 스트림
		// 소켓의 스트림은 바이트기반 스트림. 따라서, 문자기반 스트림으로 변환 필요
		// -> InputStreamReader
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트 기다리는 중");
			socket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			is = socket.getInputStream();
			in = new BufferedReader(new InputStreamReader(is));
//			dis = new DataInputStream(is);
			
			String recvMsg = in.readLine();
//			String recvMsg = dis.readUTF();
			System.out.println("클라이언트가 보낸 메시지 : " + recvMsg);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
				is.close();
//				dis.close();
				in.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
