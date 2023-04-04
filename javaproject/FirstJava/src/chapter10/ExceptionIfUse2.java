package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIfUse2 {

	public static void main(String[] args) {

		// 실행중에 프로그램이 종료된 상태이다. 이런 상황을 런타임인셉션이라고 한다.
		// 0으로 나누는 것은 불가하다.
//		Scanner sc = new Scanner(System.in);
		Scanner sc = null;

		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수하나를 입력하세요");

		int num1 = 0;
		int num2 = 0;

		try {
			num1 = sc.nextInt(); // 예외 발생 가능

			System.out.println("두 번째 정수를 입력하세요.>>>>");

			num2 = sc.nextInt(); // 예외 발생 가능
			// try블락은 예외가 발생되는 코드를 감싸주는 역할
			System.out.println(num1 / num2); // 예외 발생 가능
			System.out.println("연산이 성공적으로 실행되었습니다."); // 예외 없을 떄 실행된1다.
		} catch (ArithmeticException e) {
			// catch는 예외타입에 따라 예외처리를 해주는 블록이다.
			System.out.println("0으로 나누기는 불가합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			// System.out.println("프로그램을 종료합니다.");
			// return; // 메인메서드 종료. 프로그램 종료와 같다.
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
			
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println(e.getMessage());
		} finally {
			//try 블록으로 진입하면 무조건 실행
			System.out.println("무조건 실행하는 구문입니다.");
		}

		System.out.println("프로그렘을 종료합니다.");
		// 멘위에 상위코드인 exception이 가면 그 뒤에 있는 코드 의미 없다.
		// try catch finally가 예외처리 골자라고 보면 된다.
	}

}
