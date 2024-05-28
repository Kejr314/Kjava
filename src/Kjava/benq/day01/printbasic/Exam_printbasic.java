package Kjava.benq.day01.printbasic;

public class Exam_printbasic {
	public static void main(String [] args) {
		System.out.println("이것이 원래 쓰던 거");
		System.out.print("이게 조금 다른 거\n"); // 개행이 없어서 \n 입력해줘야 함
		
		/* 형식 문자
		 * 1. 정수 : %d
		 * 2. 실수 : %f
		 * 3. 문자 : %c 
		 * 4. 문자열 : %s
		 */
		System.out.printf("정수 출력 : %d, 문자열 출력 : %s\n", 1023, "일공이삼"); // 개행이 없어서 \n 입력해줘야 함
		System.out.println("이제 끝~!");
		System.out.printf("개강날짜 : %.1f, 종강날짜 : %.2f", 5.7, 10.23); 
		// .1 : 소수점 첫번째 자리까지, .2 : 소수점 두번째 짜리까지
	}

}
