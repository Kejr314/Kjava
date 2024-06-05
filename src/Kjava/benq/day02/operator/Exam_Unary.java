package Kjava.benq.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// 단항 연산자
		// a++, ++a : a = a + 1
		int a1 = 1;
		
		System.out.println(++a1); // 전위 연산 : 연산 후 출력
		
		System.out.println(a1++); // 후위 연산 : 출력 후 연산, 다음 결과에 확인 가능
		System.out.println(a1); // 후위 연산 결과
		
		/* 문제 1
		 * a 가 10, b는 20, c = 30
		 * a++;
		 * >> a = 11, b : 20, c = 30
		 * b = (--a) + b;
		 * >> a = 10, b = 29, c = 30
		 * c = (a++) + (--b); >> 10 + 29
		 * >> a = 11, b = 29, c = 39
		 * a, b, c의 값은 얼마일까요?
		 */
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++; // 11
		b = (--a) + b; // 9 + 10
		c = (a++) + (--b); // 11
				
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		/*
		 * 문제 2
		 * x는 100, y는 33, z는 0
		 * x--;
		 * >> x= 99, y = 33, z = 0
		 * z = x-- + --y; // 99 + 32
		 * >> x = 98, y = 32, z = 131
		 * x = 99 + x++ + x; // 99 + 98 + 99
		 * >> x = 296, y = 32, z = 131
		 * y = y-- + y + ++y; // 32 + 31 + 32
		 * >> x = 296, y = 95, y = 131
		 * x = ?, y = ?, z = ?
		 */ 
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x = " + x + ", y = " + y + ", z=" + z);
		
	}
}
