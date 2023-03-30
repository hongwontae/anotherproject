package chapter05;

public class SmartPhone {

	// 변수 선언 : 멤버변수, 인스턴스 변수라고도 한다.(이상태로 실행x) 멤버들 끼리는 공유 가능하다.
	String color = "white"; // 속성 : 색상 값 (변수로 선언)
	float size = 5.7f; // 속성 : 사이즈 (변수로 선언)
	int volume = 0; // 속성 : 볼륨의 크기 (변수로 선언)

	// 메서드 정의 : 인스턴스메서드 라고도 한다.
	// 전화걸기기능
	void call() {
		System.out.println("전화를 겁니다.");
	}

	// 볼륨을 크우는 기능
	void volumeUp() {
		volume++;
	}

	// 볼륨을 낮추는 가눙
	void volumeDown() {
		volume--;
	}

	public static void main(String[] args) {

		// 클래스를 인스턴스로 만든다. - 인스턴스화
		// 인스턴스화 - 클래스에 정의된 변수와 메서드가 메모리로 로드된다.
		// 참조변수 선언 - new 클래스이름();

		// 참조변수 선언 = 클래스이름 변수이름 ; = 인스턴스 메모리 주소값을 저장하고 있다.
		SmartPhone sp = null; // 참조변수의 초기화는 null을 사용한다.

		sp = new SmartPhone(); // new키워드를 사용하면 인스턴스가 생성된다.
		// 인스턴스의 생성은 클래스에 정의된 멤버들이 메모리로 로드 된다.
		// 인스턴스 메모리의 주소값을 반환한다.

		// 인스턴스 변수의 참조 - (참조변수.변수이름)
		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);
		System.out.println("스마트폰의 볼륨 크기 : " + sp.volume);

		sp.color = "gold";
		sp.size = 6.0f;
		System.out.println();
		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 사이즈 : " + sp.size);

		System.out.println();
		// 인스턴스 메소드의 호출 = 참조변수.메서드이름()
		sp.call(); // 메인 메서드에서는 전화거는 기능을 만든 것은 아니다.

		// 볼륨의 값을 변경하는 방법
		// 1. 변수에 직접 대입하는 방법 (x), 이제는 하지 않는다.
		// 2. 메서드를 통해서 변경하는 방법
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeUp();
		sp.volumeUp();
		sp.volumeUp();
		System.out.println("현재 볼륨 값 : " + sp.volume);
		sp.volumeDown();
		System.out.println("현재 볼륨 값 : " + sp.volume);

	}

}

//어차피 같은 클래스 안에서 이동하는 거니까 이름만 써도 이용 가능하다.   