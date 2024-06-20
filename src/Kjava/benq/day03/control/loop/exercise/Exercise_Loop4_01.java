package Kjava.benq.day03.control.loop.exercise;

import java.util.*;

public class Exercise_Loop4_01 {

	public static void main(String[] args) {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.println("서로 다른 두개의 정수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 0 || num2 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");

		} else {
			if (num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}

	}

}
