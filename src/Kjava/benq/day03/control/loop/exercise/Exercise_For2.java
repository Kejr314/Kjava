package Kjava.benq.day03.control.loop.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10 = 55
		
		int sum = 0;
		int i;
		
		for(i = 1; i <= 10; i++) {
			sum +=i; // sum = sum + 1; 같은 실행 문구
			if (i < 9) {
			System.out.print(i + "+");

			}
			else {
				System.out.print(i + "=");
			}
		}
		System.out.println(sum);
	}
}
