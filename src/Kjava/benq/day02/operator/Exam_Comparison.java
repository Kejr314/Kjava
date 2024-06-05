package Kjava.benq.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		// 비교 연산자
		// 더이상 =은 이꼬르가 아니다.
		// 이꼬르는 == 이다.
		// =는 대입연산자
		
		int num1 = 50;
		int num2 = 30;
		
		boolean result1;
		boolean result2;
		boolean result3;
		boolean result4;
		
		result1 = (num1 > num2);
		result2 = (num1 < num2);
		result3= (num1 == num2); // 값이 같을 때 true
		result4 = (num1 != num2); // 값이 다를 때 true
		
		System.out.println("result1 : " + result1 + "\n" + "result2 : " + result2 + "\n" + "result3 : " + result3 + "\n" + "result4 : " + result4 );
	}

}
