package Kjava.benq.day16.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다.");
			os = socket.getOutputStream(); // Client -> Server
			is = socket.getInputStream(); // Server -> Client
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 : 24 + 42 >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println("계산결과 : " + recvMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
