package Kjava.benq.practice.socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) throws Exception {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 9090;
		
		Scanner sc = new Scanner(System.in);
		// Writer wr = null;
		OutputStream os = null; 
		DataOutputStream dos = null;
		
		socket = new Socket(address, port);
		os = socket.getOutputStream();
		PrintWriter out = new PrintWriter(os, true);
		
//		dos = new DataOutputStream(os);
		System.out.print("서버에 보낼 메시지 : ");
		String sendMsg = sc.nextLine();
		out.println(sendMsg);
//		dos.writeUTF(sendMsg);
//		dos.flush();
		
		socket.close();
		sc.close();
		os.close();
		out.close();
		sc.close();
	}

}


