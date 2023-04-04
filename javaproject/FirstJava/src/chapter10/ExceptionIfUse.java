package chapter10;

import java.util.Scanner;

public class ExceptionIfUse {

	public static void main(String[] args) {
		
		
		//실행중에 프로그램이 종료된 상태이다. 이런 상황을 런타임인셉션이라고 한다.
		// 0으로 나누는 것은 불가하다. 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수하나를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println();
		System.out.println("두 번째 정수를 입력하세요.>>>>");
		int num2 = sc.nextInt();
		
		//if를 이용해서 예외처리를 할 것이다.
		 if(num2==0) {
			 System.out.println("0으로 나누기는 불가합니다.");
			 System.out.println("프로그램을 종료합니다.");
			 return; // 메인메서드 종료. 프로그램 종료와 같다.
		 }
		
		System.out.println(num1/num2);
		System.out.println("프로그렘을 종료합니다.");

	}

}
