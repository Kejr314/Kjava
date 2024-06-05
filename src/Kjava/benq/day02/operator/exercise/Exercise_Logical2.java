package Kjava.benq.day02.operator.exercise;

import java.util.*;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		
		/* char a = 'A' + 1;
		* // String str = "";
		* // a = 'a' + 1;
		* System.out.println("문자 : " + a);
		*/
		
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력받은 문자가 대문자인지 소문자인지 확인하세요! \n");
//		
//		String sc = scanner.next();
//		char word = sc.charAt(0);
//		
//		boolean result;
//		
//		result = (word >= 'A') && (word <= 'Z');
//		
//		System.out.println("영어 대문자 확인 : " + result);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		
		char word = sc.next().charAt(0);
		boolean result;
		
		result = (word >= 65) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
		
	}

}
