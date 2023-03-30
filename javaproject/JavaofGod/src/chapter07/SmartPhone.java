package chapter07;

public class SmartPhone extends Phone {
	
	//작은 클래스 : 좁은 의미, 기능의 확장이다.
	
	public SmartPhone(String phoneNumber) {
		super(phoneNumber);
	}
	
	public SmartPhone() {};


	String model;
	
	void game() {
		System.out.println(model+" 게임을 합니다.");
	}
	
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.phoneNumber = "010-1111-2222";
		sp.call(); // 상위 클래스에 있는 멤버를 사용할 수 있다.
		
		sp.model = "Google";
		sp.game();
	}
	
}
