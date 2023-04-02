package chapter03;

public class Operate9 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 2;
		
		int age = 12;
		
		//관계연산의 값은 항상 논리값이다. (true, false)
		System.out.println(num1 == num2);
		System.out.println(num1 == 30);
		
		//성인인증 확인 체크
		System.out.println(age > 19);
		System.out.println(age<20);
		
		System.out.println();
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1<=num2);
		
		System.out.println();
		
		System.out.println(num1 != num2);
		
		
		System.out.println();
		
		//성인판단
		if(age>19) {
			//true 실행 코드
			System.out.println("참일때 실행되는 코드입니다.");
			System.out.println("성인인증! - 입장하세요");
		} else {
			//false 실행 코드
			System.out.println("거짓일 때 사용하는 코드입니다.");
			System.out.println("아이들은 오면 안돼요");
		}
		
		

	}

}
