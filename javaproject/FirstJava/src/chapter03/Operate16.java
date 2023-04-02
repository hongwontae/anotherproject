package chapter03;

public class Operate16 {
	public static void main(String[] args) {
		
		
		int num1 = 2;
		int num2 = 5;
		
		int min = (num1 < num2)? num1 : num2;
		System.out.println(min);
		
		int mxa = (num1 > num2)? num1 : num2;
		System.out.println("큰 수" + mxa);
		
		String result = num2 %2 ==0 ? "짝수" : "홀수";
		System.out.println(result);
		
		
	}

}
