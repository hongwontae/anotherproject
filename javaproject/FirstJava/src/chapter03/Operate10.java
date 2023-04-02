package chapter03;

public class Operate10 {

	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "Program";
		
		//str1과 str2는 참조변수이다. 참조변수는 객체를 가르키는 메모리 주소값을 저장하고 있다.
		//참조 변수의 비교 연수은 ==, =! 두 개만 이루진다. 크고 작다의 의미가 없다.
		
		System.out.println(str1==str2);
		System.out.println(str1!=str2);
	}

}
