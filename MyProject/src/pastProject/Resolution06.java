package pastProject;

public class Resolution06 {

	public static void main(String[] args) {
		//합을 구하는 연산식 = sum=sum+i
		
		
		
		int num = 1;
		int sum=0; //합을 저장하는 변수
		while(num<=99) {
			//반복 처리하는 문장 : 합을 구하는 연산
			sum +=num;
			num++;
		}
		
		sum = 0;
		for(int i =0; i<=99; i++){//i는 블락 안에서만 활동한다. 밖에서 int i 사용하면 밖에서도 사용가능.
//			System.out.println(i);
			sum+=i;
		}
		
		
		System.out.println("1~99까지의 합은:"+sum);

	}

}
