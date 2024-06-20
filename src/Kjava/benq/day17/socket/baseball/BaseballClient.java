package Kjava.benq.day17.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {

		String address = "127.0.0.1";
//		String address = "192.168.60.220";
		int port = 9999;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("클라이언트 소켓을 생성하였습니다.\n");
			Thread.sleep(1000);
			System.out.println("!!게임 준비 완료!!\n");
			//입출력 스트림 준비
			socket = new Socket(address, port);
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			System.out.print("숫자 입력(띄어쓰기로 구분) ex 1, 2, 3 \n =>>> ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


