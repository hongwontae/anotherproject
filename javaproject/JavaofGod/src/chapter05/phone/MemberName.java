package chapter05.phone;

import java.util.Date;//이거 안하면 java.util.Date now=new java.util.Date();해야된다.
//패키지 클래스를 가져온다.

public class MemberName {

	public static void main(String[] args) {

		Date now = new Date(); // 다른 패키지안의 클래스 사용할 때 이렇게 한다.
		java.sql.Date time = new java.sql.Date(0);
		

		SmartPhone SmartPhone = new SmartPhone();
		

		Member member1 = new Member("손흥민", "dnjsxoghd", 20, "01084893121", SmartPhone);
		Member member2 = new Member("박지성", "kaoalal3121");

		member1.showData();
		System.out.println();
		member2.showData();

		dataPrint(member1); // 매개변수의 인자 = Member타입의 인스턴스를 가르키는 주소값
							// Member member1 = new Member("손흥민", "dnjsxoghd", 20, "01084893121");
							// 이거를 가져온것이다.
		dataPrint(member2);
	}

	static void dataPrint(Member member) { // 전달받는 목적

		// Member member = member 1;
		// Member member : 매개변수이면서 참조변수이다.
		member.showData();

	}

}
