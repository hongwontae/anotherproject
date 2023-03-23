package chapter04;

public class Iftest5 {

	public static void main(String[] args) {
		//if 구문 내부에 또 다른 if 구문이 중첩해서 사용이 가능하다.
		// 양수, 응수, 0을 판별하는 프로그램을 만들어보자.
		
		int number = 5;
		if(number>0) {
			System.out.println("양수");
			if(number%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			if(number<0) {System.out.println("음수");
			} else {
				System.out.println("0");}
		}

	}

}
