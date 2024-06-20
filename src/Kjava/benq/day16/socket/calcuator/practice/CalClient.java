package Kjava.benq.day16.socket.calcuator.practice;

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
		String address = "127.0.0.1";
		int port = 8989;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 : 24 + 42 >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if("exit".equals(sendMsg)) break;
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println("계산 결과 : " + recvMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				os.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
