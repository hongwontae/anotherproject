package pastProject;

public class Resolution09 {

	public static void main(String[] args) {
		
		//1~10까지의 곱을 구하는 것이다.
		
		int result = 1;
		
		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			result = result *i;
			result*=i; //곱하기의 결과
		}
		System.out.println("1부터 10까지의 숫자들의 곱한 결과 : "+ result);
	}

}
