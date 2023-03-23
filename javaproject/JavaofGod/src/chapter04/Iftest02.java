package chapter04;

public class Iftest02 {

	public static void main(String[] args) {
		int score;
		score = 50;
		
		
		if(score>=60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");}
		
		
		int age = 20;
		if(age>19) {
			System.out.println("투표가 가능합니다.");
		} else {System.out.println("아직 투표권이 없습니다.");}
		
		//짝수 홀수 판단하는 프로그램
		int num = 6;
		if(num%2==1) {
			//나머지가 1
			System.out.println("홀수");
		}	else {
			//나머지가 0
			System.out.println("짝수");}
		
		
		
//		if(score<60) {
//			System.out.println("fail");
//		}
	}

}
