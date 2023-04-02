package chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		int score = 95;
		int key = 60;
		
		
		switch (key) {
		case 10://key==10
			System.out.println("10입니다.");
			break; // 감싸고 있는 블락을 탈출한다.
			
		case 20:
			System.out.println("20입니다.");
			break;

		default: 
			System.out.println("10 또는 20이 아닌 숫자입니다.");
			break;
		}
		
		//점수 별 학년 체크
		// score/10
		//100 - 10
		//90~99 - 9 90이상
		//80~89 - 8 80이상 90 미만
		switch (score/10) {
		case 10:
			System.out.println("a");
			break;
		case 9:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 6:
			System.out.println("d");
			break;
		case 5:
			System.out.println("e");
			break;

		default:
			System.out.println("f");
			break;
		}
		
		
		

	}

}
