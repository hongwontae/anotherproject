package chapter07;

public class ClassCasting03 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		callByPhone(androidPhone);
		callByPhone(iPhone);
	}
	//추가적인 메서드 생성이 필요 없어지는 행위
		public static void callByPhone(Phone phone){
			 phone.call(); 

	}

}
