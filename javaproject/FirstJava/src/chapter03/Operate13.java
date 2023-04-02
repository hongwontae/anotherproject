package chapter03;

public class Operate13 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 =0;
		boolean result = false;
		
		result = (num1+=10)<0 && (num2+=10)>0; // num1의 복합된 연산은 - num1=num1+10 이와 같다.
		System.out.println(result);
		System.out.println("num1 :"+num1+",num2:" + num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println(result);
		System.out.println("num1 : "+num1+ " num2 : "+ num2);
	}

}
