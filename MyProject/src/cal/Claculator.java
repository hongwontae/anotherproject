package cal;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번쨰 숫자를 입력하세요.>>>>>");
		long num1 =in.nextLong();
		
		System.out.println("두 번쨰 숫자를 입력하세요.>>>>>");
		long num2 =in.nextLong();
		
		System.out.println("연산의 결과===============");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		System.out.println();
		
		System.out.println("반지름의 길이를 입력하세요>>>>>>>>");
		double r = in.nextDouble();
		
		System.out.println("원의 둘레 : "+ cal1(r));
		System.out.println("원의 넓이 : "+ cal2(r));
		
		
		

	}
	// 1챕터 3번쨰 각 메소드내에 결과라는 변수 선언및 초기화

//	숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다. 변수를 long으로 하자 int=int가 long으로 나올 수 있어서
// 	메서드 = 반환타입, 메소드 이름, 매개변수, 처리 블럭에 반환이 있으면 return을 이용해서 반환값을 해주는 것이다.
	//메서드 블락 안에 메서드 들어가는 경우는 절대 없다.
	// .들어가야 하위 패키지 만들 수 있다.
	
	//변경
	//정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add(long num1, long  num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
//	 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	//매개 변수도 메서드 안에서만 활동하는 변수이다. 지역변수이다.(블락안에서 사용가능한 메서드)
	//변경
	//정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	static void sub(long num1, long num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));

	}
	
	
	
//	 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	//변경
	//정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	static void mul(long num1, long num2) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));

	}
	
	
	//숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	
	//정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의/
	static void div(float num1, float num2) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
	
	static double cal1(double r) {
		//: 2 x π x r 원의 둘레
		return 2 * Math.PI*r;
	}
	
	static double cal2(double r) {
		// π x r x r 원의 넓이
		return Math.PI*r*r;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
