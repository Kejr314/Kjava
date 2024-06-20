package Kjava.benq.day03.control.loop.exercise;

import java.util.*;

public class Exercise_Loop5 {

	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		int i;
		int result = 0;
		
		for(i=1; i < 10; i++) {
			result = num * i;
			System.out.println(num + "*" + i + " = " + result);
		}
	}
}
