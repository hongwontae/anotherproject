package chapter07;

public class SmartPhone02 extends Phone {
	
	String model;

	// 상위 클래스에 매개변수가 있는 생성자가 있다면 상위클래스의 멤버를 초기화할 데이터까지 받아서
	// 상위 클래스의 생성자를 호출해주어야 한다.!
	// 현재 클래스에 멤버를 초기화 한다.(순서)
	public SmartPhone02(String phoneNumber, String model) {
		//상위 클래스의 생성자를 호출한다.
		super(phoneNumber);// 생성자 호출(상위클래스)
		//현재 클래스의 인스턴스 변수의 최기화
		this.model = model;
	}

	void game() {
		super.call();
		System.out.println(model+" 게임을 합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhone02 smartPhone = new SmartPhone02("010=5555-9999", "105");
		
		smartPhone.game();
	}

}
