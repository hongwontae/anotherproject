package chapter09;

import java.util.Scanner;

public class Exit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 메뉴 Loop
		while (true) {
			System.out.println("메뉴의 번호를 입력하세요");
			System.out.println("1번.입력  2.검색  3.수정  4.삭제 5.프로그램 종료");
			System.out.println("메뉴 입력>>>");
			int num = sc.nextInt();
			System.out.println();

			// 사용자의 입력값에 따라 분기

			switch (num) {
			case 1:
				System.out.println("입력합니다.");
				break;
			case 2:
				System.out.println("검색합니다.");
				break;
			case 3:
				System.out.println("수정합니다.");
				break;
			case 4:
				System.out.println("삭제합니다.");
				break;
			case 5:
				System.exit(0);
			}
			System.out.println("종료되었습니다.");

		}

	} 

}
