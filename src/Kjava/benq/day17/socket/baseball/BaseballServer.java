package Kjava.benq.day17.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.\n 클라이언트의 접속을 기다립니다...");
			socket = serverSocket.accept();
			// 중복없이 1~9사이의 랜덤한 숫자 3개 구하기
			// Math.random() * (최대값 - 최소값 + 1) + 최소값
			// 기본적으로 Math.random = 0.0~1.0미만의 랜덤한 실수
			int[] numbers = new int[3];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = (int) (Math.random() * 9) + 1;
				// 랜덤한 실수 중 중복 없애기
				for(int j = 0; j<i;j++) {
					if(numbers[i]==numbers[j]) {
						i--; //중복제거의 포인트!	
						break;
					}
				}
			}
			System.out.println("!!서버준비완료!!");
			System.out.println(" 클라이언트가 접속했습니다... ");
			System.out.print("랜덤한 숫자 3개를 출력합니다. >>  ");
			for(int num : numbers) {				
				System.out.print(num  + "  ");
			}
			// 입출력 스트림 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();

			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			String recvMsg = dis.readUTF();
			String[] inputNums = recvMsg.split(" ");
			System.out.println("\n받기 : " + recvMsg);
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					int num = Integer.parseInt(inputNums[j]);
					if (numbers[i] == num) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			String result = "  **  " + strike + " 스트라이크 " + ball + " 볼  **";
			dos.writeUTF(result);
			dos.flush();

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
