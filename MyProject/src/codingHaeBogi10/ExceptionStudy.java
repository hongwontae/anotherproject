package codingHaeBogi10;

import java.util.Scanner;

public class ExceptionStudy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		int score = sc.nextInt();
		try {
			if (!(score >= 0 && score < 100)) {
				Exception e = new Exception(); // 예외 인스턴스 생성
				throw e; // 강제로 예외 발생 : 가상 머신에 예외 발생 알림
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// 컴파일 에러는 컴파일 할 떄 발생하는 에러이다.
// 런타임 에러는 실행할 때 발생하는 에러이다.
// 논리적 에러는 작성 의도와 다르게 동작하는 에러이다.

//java의 런타임 에러
// 에러와 예외로 나뉜다.

//직접 정의하여 사용하는 예외를 사용자 정의 예외라고 한다.
// 1. 사용자 정의 예외는 반드시 java.lang.Exception 클래스를 상속받아 정의해야 한다.
// 2. 사용자 정의 예외는 jvm에서 예외를 발생시켜 주지 않으므로 직접 예외를 생성해야 한다.
// 3. 예외 생성 하기 : throw new 사용자정의예외()