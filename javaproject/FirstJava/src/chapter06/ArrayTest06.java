package chapter06;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int [][] scores = {
				{100,90,80},
				{98,76,65},
				{85,84,77},
				{89,100,69}	
							};
		
		for(int i =0; i<scores.length;i++) { //행을 반복
			//scores[i] - 반복하면서 각각의 1차원 배열
			
			//열의 반복 : 각 1차원 배열의 요소를 출력하는 것이다.
			for(int j=0; j<scores[j].length; j++) {
				System.out.print("number["+i+"]["+j+"]= "+scores[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
