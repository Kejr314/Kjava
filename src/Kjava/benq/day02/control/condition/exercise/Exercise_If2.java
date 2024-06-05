package Kjava.benq.day02.control.condition.exercise;

import java.util.*;

public class Exercise_If2 {

	public static void main(String[] args) {
		// 문제 2
		// 커피 메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오.
		// 주문하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해주세요 : 에스프레소
		// 2500원 입니다.
		// 메뉴를 입력해주세요 : 자바칩 프라프치노
		// 없는 메뉴입니다.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("주문하시겠어요? 가격을 알려드립니다. ");
	System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
	System.out.print("입력해주세요 : ");
	String menu = sc.next();
	
		if(menu.equals("에스프레소")) { // 문자열 비교는 ==이 안 됨, 문자열 비교는 equals
			System.out.println("2500원 입니다.");
		}
		else if(menu.equals("카푸치노")) { // contains 메소드도 있음. 포함되면 true 리턴
			System.out.println("4000원 입니다.");
		}
		else if(menu.equals("카페라떼")) {
			System.out.println("4000원 입니다.");
		}
		else if(menu.equals("아메리카노")) {
			System.out.println("3000원 입니다.");
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
	}
}
