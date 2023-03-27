package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp1 = new SmartPhone("red", 5.0f, 10); // 이거를 실행한 것 (인스턴스 생성!)
		SmartPhone sp2 = new SmartPhone("gold", 5.0f);
		SmartPhone sp3 = new SmartPhone();	  // 기본 생성자 때는 문제x 우리는 매개변수 3개로 받는 생성자

//		sp.color = "white";
//		sp.size = 4.5f;
//		sp.volume= 5;

//		System.out.println(sp.color);
//		System.out.println(sp.size);
//		System.out.println(sp.volume);
		System.out.println(sp1.color);
		System.out.println(sp2.size);
		System.out.println(sp3.volume);

	}

}
