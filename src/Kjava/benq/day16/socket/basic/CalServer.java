package Kjava.benq.day16.socket.basic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("연결을 기다리고 있습니다.");
			socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
			
			is = socket.getInputStream(); // Client -> Server
			os = socket.getOutputStream(); // Server -> Client
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				String recvMsg = dis.readUTF(); // num1 + num2
				String result = "";
				// num1과 num2를 나누어 배열에 대입
				String [] data = recvMsg.split(" "); 
				// num1, num2 정수로 형변환
				int num1 = Integer.parseInt(data[0]);
				String operator = data[1];
				int num2 = Integer.parseInt(data[2]);
				switch (operator) {
				case "+":
					result = num1 + num2+"";
					break;
				case "-":
					result = num1 - num2+"";
					break;
				case "*":
					result = num1 * num2+"";
					break;
				case "/":
					result = num1 / num2+"";
					break;
				case "%":
					result = num1 % num2+"";
					break;
				default:
					break;
				}
				dos.writeUTF(result);
				dos.flush();
				System.out.println(recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
