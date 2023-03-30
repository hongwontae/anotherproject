package chapter07;

public class SmartPhoneImpI extends Phone {

	String model;

	public SmartPhoneImpI(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화를 합니다.");
	}

	public static void main(String[] args) {
		SmartPhoneImpI phone = new SmartPhoneImpI("010-2222-2222", "google");
		phone.call();
	}

}
