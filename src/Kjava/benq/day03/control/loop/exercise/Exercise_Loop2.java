package Kjava.benq.day03.control.loop.exercise;

import java.util.*;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			
			System.out.print(i);
		
		}
		
	}
}
