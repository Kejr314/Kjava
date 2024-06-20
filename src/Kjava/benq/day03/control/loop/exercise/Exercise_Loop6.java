package Kjava.benq.day03.control.loop.exercise;

import java.util.*;

public class Exercise_Loop6 {

	public static void main(String[] args) {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		
		int num = sc.nextInt();
		int result = 0;
		
		if(num > 0 && num <= 9) {
			for(int i = num; i < 10 ; i++) {
				
				for(int j = 1; j < 10; j++) {
					
					result = i * j;

					System.out.print(i + "*" + j + " = " + result + "\n");
				}
			}
		}
		else {
			System.out.print("9 이하의 숫자만 입력해주세요");
		}
	}

}
