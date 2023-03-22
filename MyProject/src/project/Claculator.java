package project;

public class Claculator {

public static void main(String[] args) {
		
	}
	//1챕터 3번쨰 각 메소드내에 결과라는 변수 선언및 초기화
	
	static int add (int add1, int add2) {
		int result = 0;
		
		result = add1 + add2;
		
		return result;
	}
	static int substract (int sub1, int sub2) {
		int result = 0;
		
		result = sub1 - sub2;
		return result;
	}
	static int multiply (int mul1, int mul2) {
		int result = 0;
		
		result = mul1 * mul2;
		return result;
	}
	static int divide (int div1, int div2) {
		int result = 0; 
		
		result = div1 / div2;
		return result;
	}
}
