package Kjava.benq.day03.control.loop.exercise;

public class Exercise_While1 {
	public static void main(String [] args) {
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		
		int i = 0;
		int sum = 0;
		// 합 시작
			while (i <= 100) {
				if(i % 2 == 1) { // i % 2 != 0
					sum += i;
				}
				i++;
			}
			// 합 끝
			System.out.print("1 ~ 100 사이의 홀수의 합 : " + sum);
			// 합 출력
		}
	}
