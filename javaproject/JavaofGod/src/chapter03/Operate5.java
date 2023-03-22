package chapter03;

public class Operate5 {

	public static void main(String[] args) {
		
		int num1 = 30;
		System.out.println(num1++); //num1 등장 후 추가
		
		System.out.println(++num1); //num1 먼저 증가 32
		
		System.out.println(num1--); //num1의 값은 31
		
		System.out.println(--num1); //num1의 값은 30
		
		System.out.println(num1++ + ++num1); //num1 30을 가져오고 

	}

}
