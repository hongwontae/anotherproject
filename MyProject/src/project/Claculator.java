package project;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {

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