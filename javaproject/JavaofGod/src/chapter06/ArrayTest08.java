package chapter06;

public class ArrayTest08 {

	public static void main(String[] args) {
		
		int [][] arr= {
				{100,80,40},
				{60,70,80} // int[] arr = 둘다 받음
		};
		
		//2차원 배열은 1차원 배열들을 요소로 가지는 배열이다. 이것이 핵심이다.
		//arr[0] = 1차원 배열을 가지는 배열 변수이다. 주소값
		//arr[1] = 1차원 배열을 가지는 배열 변수이다. 주소값
		
		
		for(int[] temp : arr) {
			//int[] temp = {100,80,40};
			//int[] temp = {60,70,80}; 들어온다.
			for(int num : temp) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
