package codingHaeBogi10;

import java.util.Scanner;

public class BadInputExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();

		try {
			for (int i = 0; i < id.length(); i++) {
				char c = id.charAt(i);
				if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
					BadIdInputException e = new BadIdInputException("입력값 오류.");
					throw e;
				}
			}
		}

		catch (BadIdInputException e) {
			System.out.println("입력값 오류.");
		}

	}

}
