package chapter02;

public class casting2 {
	public static void main(String[] args) {
		
		byte b =10;
		int i =(int)b;  //(int)생략가능하다.
		System.out.println("i="+i);
		System.out.println("b="+b);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		
		System.out.println("i2="+i2);
		System.out.println("b2="+b2); //역방향으로 갈 때는 주의해야 한다.
									  // 왜곡이 생길 수 도 있다.
		boolean check1 = false;
		System.out.println(!check1);
	}

}