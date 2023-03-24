package pastProject;

public class Resolution12 {

	public static void main(String[] args) {
		//자연수 1부터 시작해서
		//모든 홀수와 3의 배수인 짝수를
		//더해 나간다. 
		//그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지,
		//그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
		
		int num =1;
		int sum = 0;
		
		while(true) {
			//모든 홀수와(또는, 이거나) 3의 배수인 짝수를(and)
//			if(num%2==1 || (num%3==0 && num%2==0)) //생략 가능하다. 앤드 계산이 우선이기 때문이다.
//			{sum +=num;
//			
//			}
			
			if(num%2==1) {
				sum+=num;
			}else if(num%3==0) {//짝수이다. 2의 배수이다.
				sum+=num; //공통적인 코드는 안 만드는 게 좋다.
			}
			
			if(sum>1000) {
				System.out.println(num+"값을 더했을 때 1000이 넘어갑니다.");
				System.out.println("최초로 1000이 넘어간 숫자는"+sum);
				break;
			}
			num++;
			
			
		}
		
		
		
		
		
		
	}

}
