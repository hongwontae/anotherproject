package chapter09;

public class RandomMath {

	public static void main(String[] args) {
		
		//특정 범위의 난수 추출하는 방법
		double num = (int)(Math.random()*10)+1; 
		//0~0.999999999=> 0~9.999999 => 0~9로 change +1 = 1~10
		
		System.out.println(num);
		
		System.out.println();
		
		for(int i=0; i<6; i++) {
			int num1 = (int)(Math.random()*45)+1;
			System.out.println(num1);
		}
		
		
		
		
		
	}

}
