package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		//배열의 선언
		int[] scores; // int타입의 배열 인스턴스 주소를 가지는 변수이다.
		
		//배열의 생성
		scores = new int[10]; // int타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		for(int i =0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("------------------------");
		//타입들 기본값으로 초기화 되었기에 0이 10번 나온다. 
		
		
		//배열 요소의 참조
		//배열 이름[index]
		//index = 0~n-1
		//요소의 개수 = 배열변수.length
		
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
		//이게 귀찮아서 다르게 처리할 수 있다. (배열의 선언과 초기화)
		
		//총합
		int sum=0;
		//평균값
		float avg = 0.0f;
		
		
//		scores[10] = 60; 이거 오류난다.
//		System.out.println(scores[1]);
		// index = 0~9
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
			//합의 연산
			sum = sum+scores[i];
		}
		
		avg=sum/(float)scores.length; //형변환을 했다.
		System.out.println("점수들의 총점 : "+ sum);
		System.out.println("점수들의 평균값"+avg);
		
		
		
		

	}

}
