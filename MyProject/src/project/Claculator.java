package project;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
<<<<<<< HEAD

		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		long num1 = in.nextLong();
		System.out.println("두 번째 숫자를 입력하세요");
		long num2 = in.nextLong();
		System.out.println("연산의 결과 ====================");
		  add(num1, num2); minus(num1, num2);
		  big(num1, num2); mkdir(num1, num2);
		  
		  System.out.println();
		  
		  System.out.println("반지름을 입력하기 바랍니다.");
		  double r = in.nextDouble();
		  
		  System.out.println("원의 둘레 : " + cal1(r));
			System.out.println("원의 넓이 : " + cal2(r));
		  
		

	}

	static void add(long num1, long num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}
	
	static void minus(long num1, long num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	
	static void big(long num1, long num2) {
		System.out.println(num1+"*"+num2+"="+num1*num2);
	}
	
	static void mkdir(long num1, long num2) {
		System.out.println(num1+"//"+num2+"="+num1/num2);
	}
	
	static double cal1(double r) {
		return 2 * Math.PI * r;
	}
	
	static double cal2(double r) {
		return Math.PI * r * r;	
	}
	
	
	
=======
		
		
		//메서드 호출되면 지역변수들의 메모리가 사라져서 다른 메서드의 이름명 같아도 상관없다.
		//void 반환 값이 없다.
		System.out.println(add(20,10));
		System.out.println(sub(20,10));
		System.out.println(mul(10,5));
		System.out.println(div(10f,3f));
		System.out.println(div(10,3));
		//자동 형 변환이 된다
 

	}
	// 1챕터 3번쨰 각 메소드내에 결과라는 변수 선언및 초기화

//	숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다. 변수를 long으로 하자 int=int가 long으로 나올 수 있어서
// 	메서드 = 반환타입, 메소드 이름, 매개변수, 처리 블럭에 반환이 있으면 return을 이용해서 반환값을 해주는 것이다.
	//메서드 블락 안에 메서드 들어가는 경우는 절대 없다.
	// .들어가야 하위 패키지 만들 수 있다.
	static long add(long num1, long  num2) {
		
//		long result = num1+num2;
//		return result;
		
		return num1+num2;
	}
	
//	 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	//매개 변수도 메서드 안에서만 활동하는 변수이다. 지역변수이다.(블락안에서 사용가능한 메서드)
	static long sub(long num1, long num2) {
		return num1-num2;
	}
	
	
	
//	 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	static long mul(long num1, long num2) {
		return num1*num2;
	}
	
	
//	 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	//
	static float div(float num1, float num2) {
		return num1/num2;
	}
	

>>>>>>> ef765ede1f1e1ee577b8c3ec4ab902800aa99d08
}

/*
 * package project;
 * 
 * import java.util.Scanner;
 * 
 * public class Calcurator {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.println("첫 번째 숫자를 입력하세요. >>"); long num1 = in.nextLong();
 * 
 * System.out.println("두 번째 숫자를 입력하세요. >>"); long num2 = in.nextLong();
 * 
 * System.out.println(" 연산의 결과 ========="); add(num1, num2); sub(num1, num2);
 * mul(num1, num2); div(num1, num2);
 * 
 * System.out.println();
 * 
 * System.out.println("반지름의 길이를 입력하세요. >>"); double r = in.nextDouble();
 * 
 * 
 * System.out.println("원의 둘레 : " + cal1(r)); System.out.println("원의 넓이 : " +
 * cal2(r));
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * // ① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다. // 반환타입, 메소드 이름, 매개변수, 반환이 있다면
 * return 반환값
 * 
 * // 변경 // ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의 static void add(long
 * num1, long num2) { System.out.println(num1 + "+" + num2 + "=" + (num1+num2)
 * ); }
 * 
 * // ②숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다. // ②정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후
 * 출력하는 메소드를 정의 static void sub(long num1, long num2) { System.out.println(num1
 * + "-" + num2 + "=" + (num1-num2) ); }
 * 
 * 
 * // ③숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다. // ③정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후
 * 출력하는 메소드를 정의 static void mul(long num1, long num2) { System.out.println(num1
 * + "*" + num2 + "=" + (num1*num2) ); }
 * 
 * // ④숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다. // ④정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후
 * 출력하는 메소드를 정의 static void div(float num1, float num2) {
 * System.out.println(num1 + "/" + num2 + "=" + (num1/num2) ); }
 * 
 * // 원의 둘레 static double cal1(double r) { // 2 x π x r return 2 * Math.PI * r;
 * }
 * 
 * // 원의 넓이 static double cal2(double r) { // π x r x r return Math.PI * r * r;
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */