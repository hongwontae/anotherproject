package project;

public class Challenge05 {

	public static void main(String[] args) {

		int num = 90;
		int divBy100 = num / 100;

		if (num < 0) {

			System.out.println("num은 0미만");
		} else {
			switch (divBy100) {

			case 0: {
				System.out.println("num은 0이상 100미만");
				break;
			}

			case 1: {

				System.out.println("num은 100이상 200미만");
				break;
			}
			case 2: {
				System.out.println("num은 200이상 300미만");
				break;
			}
			case 3: {

				System.out.println("num은 300이상");
				break;
			}
			default:
				System.out.println("num은 400이상");

			}
		}
	}

}
