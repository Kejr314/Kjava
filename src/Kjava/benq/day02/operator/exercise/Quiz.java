package Kjava.benq.day02.operator.exercise;

public class Quiz {
	
	public static void main(String [] args) {
		
		int a = 5; 
		int b = 10;
		int c = (++a) + b; // a = 6, b = 10, c = 16
		int d = c / a; // a = 6, b = 10, c = 16, d = 2
		int e = c % a; // a = 6, b = 10, c = 16, d = 2, e = 4
		int f = e++; // a = 6, b = 10, c = 16, d = 2, e = 5, f = 4 (f는 현재의 e값(4)를 가지고 e 증가시킴)
		int g = (--b) + (d--); // a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 9 + 2 = 11 (g 구할 때 --b는 감소시킨 b 값)
		int h = 2; // a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 11, h = 2
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); 
		// a = 7, b = 9, c = 15, d = 1, e = 6, f = 4, g = 10, h = 2
		// i = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2) 
		//   = 6 + 9/3 * 10 % 8 
		//   = 6 + 3 * 10 % 8 
		//   = 6 + 30 % 8 
		//   = 6 + 6 = 12
		
		System.out.println("a : " + a); // a : 7
		System.out.println("b : " + b); // b : 9
		System.out.println("c : " + c); // c : 15
		System.out.println("d : " + d); // d : 1
		System.out.println("e : " + e); // e : 6
		System.out.println("f : " + f); // f : 4
		System.out.println("g : " + g); // g : 10
		System.out.println("h : " + h); // h : 2
		System.out.println("i : " + i); // i : 12
	}

}
