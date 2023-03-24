package pastProject;

public class Resolution13 {

	public static void main(String[] args) {
		
		for(int i = 2; i<9; i*=2) { //i*=2가 제일 중요하다.
			//증가식의 패턴은 다양하다.
			//System.out.println(i);
			for(int j=1; j<=i; j++) { //비교하는 게 리터럴만은 아니다.
				System.out.print(i+"x"+j+"="+i*j+" ");
			}
			
			System.out.println();
			
		}
		

	}

}
