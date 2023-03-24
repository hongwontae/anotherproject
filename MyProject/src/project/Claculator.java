package project;

public class Claculator {

	public static void main(String[] args) {
		
		
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
	

}
