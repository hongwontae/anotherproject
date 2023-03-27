package chapter05;

public class LocalVariable {

	void method(int num) {
		// 매개변수는 - 지역변수로 메서도 호출시에 생성하고 메서드 종료시에 소멸된다.

		// 메서드 블록 안에서 선언되는 변수도 지역변수
		// 선언시점에 메모리가 생성 - 메소드가 종료될 때 소멸된다.
		int lv = 10;

		if (lv > 10) {
			boolean chk = true;
			System.out.println(chk);
		} else {
			boolean chk = false;
			System.out.println(chk);
		}
		// System.out.println(chk); // chk변수는 if블락내에서만 사용 가능한 변수이다.
		int i = 0;

		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}

		while (lv < 5) {
			int lv2 = 100;
			System.out.println(lv2);
			lv++;
		}

		System.out.println(lv);
	}

	void method2(int num) {
		int lv = 10;
		// 실행시점이 끝나고 시작되기 때문에 오류x 메서드 이름이 다르면 안의 이름 같아도 상관없다.
	}

}
