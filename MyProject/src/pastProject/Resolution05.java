package pastProject;

public class Resolution05 {

	public static void main(String[] args) {
		int num = 120; // 범위가 반전된다.
		if (num < 0) {
			System.out.println("0미만");
		} else {
			switch (num / 100) { //num/100하는 것이 중요한 키워드이다.
			case 0: // 0~99
				System.out.println("0이상");
				break;
			case 1: // 100~199미만
				System.out.println("100이상 200미만");
				break;
			case 2: // 200~299미만
				System.out.println("200이상 300미만");
				break;
			default:
				System.out.println("300이상");
			}

		}

	}

}
