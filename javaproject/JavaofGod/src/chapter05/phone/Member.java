package chapter05.phone;

public class Member {
	
	//변수 
	String name;
	String email;
	int age;
	String phoneNumber;
	SmartPhone phone; //null
	
	public Member
	(String name, String email, int age, String phoneNumber, SmartPhone phone) {
//		super(); 상속할 때 하자
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.phone = phone;
	}

	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력데이터가 없습니다.";//기본값을 넣어주는 것이다.
		this.phone = new SmartPhone();
	}
	
	void showData() {
		System.out.println("이름  : "+ this.name);
		System.out.println("이메일  : "+ this.email);
		System.out.println("나이 : "+ this.age);
		System.out.println("전화번호 : "+ this.phoneNumber);
		this.phone.call();
	}
	
	
	
	
}
