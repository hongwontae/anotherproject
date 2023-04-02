package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {

		// SamrtPhone 클래스의 인스턴스를 만들어서 프로그램을 완성할거야.
		SmartPhone sp1 = new SmartPhone();
		System.out.println(sp1.color);
		System.out.println(sp1.size);

		SmartPhone sp2 = new SmartPhone(); // new라고 만든다는 것은 메모리 집합을 만드는 것이다. sp1, sp2는 다른 것이다.
		sp2.color = "red";
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);

		// sp1, sp2 참조변수이다. = 메모리 주소값을 가지는 변수/ 우리가 생성한 인스턴스와 주소값은 항상 일치하지는 않는다는 것

		sp1 = sp2; // sp1 (0x100) sp2(0x200) = 이 결과는? 두 개는 0x200
		System.out.println("------------------------------------");
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp2.color);
		System.out.println(sp2.size);

	}

}