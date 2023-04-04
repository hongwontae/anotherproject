package codingHaeBogi10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램을 시작합니다.");
		int num=0;
		
		try {
			System.out.println("생일을 입력하세요");
			 num = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		} catch(Exception e) {
			System.out.println("모든 오류는 내가 책임진다.");
			System.out.println(e.getMessage());
		}
		
	}

}
