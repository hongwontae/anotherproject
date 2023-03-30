package chapter06;

public class ArrayTest03 {

	public static void main(String[] args) {

		// 배열의 선언
		int[] scores; // int타입의 배열 인스턴스 주소를 가지는 변수이다.

		// 배열의 생성
		scores = new int[15]; // int타입의 요소 10개를 가지는 배열 인스턴스 생성

		for (int i = 0; i < scores.length; i++) {
			//System.out.println(scores[i]);
		}

		//System.out.println("------------------------");
		// 타입들 기본값으로 초기화 되었기에 0이 10번 나온다.

		// 배열 요소의 참조
		// 배열 이름[index]
		// index = 0~n-1
		// 요소의 개수 = 배열변수.length

		scores[0] = 60;
		scores[1] = 90;
		scores[2] = 70;
		scores[3] = 80;
		scores[4] = 43;
		scores[5] = 50;
		scores[6] = 35;
		scores[7] = 75;
		scores[8] = 100;
		scores[9] = 40;
		scores[10] = 840;
		scores[11] = 540;
		scores[12] = 840;
		scores[13] = 540;
		scores[14] = 440;
		
		resultPrint(scores);
		
		
	}

	// 점수를 저장하고 있는 배열을 전달받아 매개변수에;
	// 총점수와 평균값을 출력하는 메서드
	static void resultPrint(int[] arr) {//int [] arr = scores;

		// 전달받은 배열 : int 타입의 배열이다. size 제약은 없다. 그렇기에 length 쓰자.
		int sum = 0;
		float avg = 0.0f; // 습관적으로 초기화 해주는 것이 좋다.
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = (float) sum / arr.length;
		System.out.println("===================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : "+ avg);

	}

}
