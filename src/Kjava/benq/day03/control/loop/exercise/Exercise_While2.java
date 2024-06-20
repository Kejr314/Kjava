package Kjava.benq.day03.control.loop.exercise;

import java.util.*;

public class Exercise_While2 {
	public static void main(String [] agrs) {
		// While문을 이용하여 -1이 입력될 때까지
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 값 : 1
		// 값 : 2
		// 값 : -1
		// 합 : 3
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
//		int lastNum;
//		System.out.print("정수 하나 입력 : ");
//		while ((lastNum = sc.nextInt()) != -1){
//			sum_+= lastNum;
//		}
		///////////////////////////////////////////////////
		int val;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			val = sc.nextInt();
			if(val == -1) break;
			sum += val;
		}
		System.out.println("총합 : " + sum);
		//////////////////////////////////////////
		int input = sc.nextInt();
		
		while(input != i) {
				sum += input;
				System.out.print("정수 하나 입력 : ");
				input = sc.nextInt();
			}
		System.out.println("총합 : " + sum);
	}

}
