package Kjava.benq.day02.operator;

public class Eaxm_Logical {

	public static void main(String[] args) {
		// 논리연산자 예제
		// 남자이면서 평균평점 4.3 이상인 사람 -> and
		// 컴퓨터공학과 또는 경영학과인 사람 -> or
		
		boolean result1, result2, result3, result4;
		
		// AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		
		result1 = (num1 == num2) && (num1 < num2); // 둘 다 true 이여야 결과값 true
		result2 = (num1 < num2) || (num1 == num2); // 둘 다 false 이여야 결과값 false
		result3 = (num1 > num2) && (num1 != num2); // 둘 다 true 이기 때문에 true
		result4 = (num1 > num2) || (num1 == num2); // 앞에 있는 항이 true 이기 때문에 true
		
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		
		// 문제 1
		boolean result5, result6, result7, result8;
		
		int a1 = 50;
		int b1 = 30;
		
		result5 = (a1 != b1) && (a1 < b1); // true && false -> false
		result6 = (a1 < b1) || (a1 == b1); // false || false -> false
		result7 = (a1 > b1) && (a1 != b1); // true && true -> true
		result8 = (a1 > b1) || (a1 == b1); // true || false -> true
		
		System.out.println("결과값5 : " + result5);
		System.out.println("결과값6 : " + result6);
		System.out.println("결과값7 : " + result7);
		System.out.println("결과값8 : " + result8);
		
		// 문제 2
		boolean result9, result10, result11, result12;
		
		int a2 = 75;
		int b2 = 55;
		
		result9 = (a2 == b2) || (a2++ < 100); // a2 = 71, b2 = 55 / false || true -> true 
		result10 = (a2 < b2) && (--b2 < 55); // a2 = 71, b2 = 55 / 앞의 항 false -> false
		result11 = (a2 != b2) && (b2-- < a2++); // a2 =72, b2 = 54 / true && true -> true
		result12 = (a2++ != b2) || (b2++ >= 85); // a2 = 73, b = 54 / 앞의 항 true -> true
		
		System.out.println("a : " + a2 + ", b : " + b2);
		System.out.println("결과값9 : " + result9);
		System.out.println("결과값10 : " + result10);
		System.out.println("결과값11 : " + result11);
		System.out.println("결과값12 : " + result12);
		
	}

}
