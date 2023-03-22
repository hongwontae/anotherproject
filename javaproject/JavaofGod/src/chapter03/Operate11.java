package chapter03;

public class Operate11 {

	public static void main(String[] args) {
		
		char c ='A';
		int num = 10;
		
		System.out.println(c>10); //char int  int int 계산으로 바뀐다.
		System.out.println('1'>'0'); //char char - int int로 변해서 계산이 된다.
		System.out.println(num == 10f);//float타입으로 바뀌어서 서로 비교한다.

	}

}
