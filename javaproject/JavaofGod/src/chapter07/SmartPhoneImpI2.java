package chapter07;

public class SmartPhoneImpI2 extends Phone {

	String model;

	public SmartPhoneImpI2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println(model+"이어팟을 이용해서 통화를 합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}

	public static void main(String[] args) {
		
		//다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는 것이다.
		Phone p = new SmartPhoneImpI2("010-8888-9999", "IOS");
		p.call(); //하위 타입의 인스터스에 정의되어 있는 오버라이딩된 call매서드가 호출된다.
		
//		p.playMusic(); //상속관계 내에서만 자료형 형 변환 가능
		
//		SmartPhoneImpI2 p2 = new SmartPhoneImpI2("800", "test");
		SmartPhoneImpI2 p2 = (SmartPhoneImpI2)p;
		p2.playMusic();
		
		
		
	}

}
