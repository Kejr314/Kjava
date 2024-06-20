package Kjava.benq.day03.control.loop;

public class Exam_While {

	public static void main(String[] args) {
//		2. While 문
//		문법
//		초기식;
//		while(초기식) {
//			실행문장; 증가식;
//		}
		
		int i = 0; // 초기식이 while문 밖에 있어야 함. for과 차이점
		while(i < 10) {
			System.out.print(i);
			i++;
		}
		
		for(int j = 0; j < 10; j++) {
			System.out.print(j);
		}
	}

}
