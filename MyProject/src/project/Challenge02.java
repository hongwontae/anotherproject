package project;

public class Challenge02 {

	public static void main(String[] args) {

		int num = 89;
		if (num < 0) {
			System.out.println("0미만");
		} else if (num < 100) {
			System.out.println("0이상 100미만");
		} else if (num < 200) {
			System.out.println("100이상 200미만");
		} else if (num < 300) {
			System.out.println("200이상 300미만");
		} else {
			System.out.println("300이상 출력");
		}

	}

}
