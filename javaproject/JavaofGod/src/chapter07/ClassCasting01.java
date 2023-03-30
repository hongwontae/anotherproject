package chapter07;

public class ClassCasting01 {
	public static void main(String[] args) {

		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		
		Phone phone1 = (Phone) androidPhone; // 형 변환 연산자를 이용해서 형 변환
		phone1.call();
		
		Phone phone2 = androidPhone; // 형 변환 연산자 없이 자동 형 변환
		phone2.call();

	}
}
