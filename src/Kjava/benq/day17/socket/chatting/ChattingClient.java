package Kjava.benq.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingClient {
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
			// 1. 소켓 생성
			socket = new Socket(address, port);
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			System.out.println("서버와의 연결이 완료되었습니다. ");
			while(true) {
			// 서버로부터 받은 메세지 출력 => dis.readUTF
			String recvMsg = dis.readUTF();
			if("end".equals(recvMsg)) {
				System.out.println("채팅이 종료되었습니다.");
				break;
			}
			System.out.print("서버(상대) : " + recvMsg);
			System.out.println();
			// 서버에게 메세지 보내기 =>dos.writeUTF
			System.out.print("클라이언트(나) : ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
			if("end".equals(sendMsg)) {
				System.out.println("채팅이 종료되었습니다.");
				break;
			}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
