package alexanderAronld;

public class AlexanderAronld {

	public static void main(String[] args) {
		
		int twice = 0;
		int once = 0;
		
		for(int i =1; i<=100; i++) {
			if(i%2==0) {
				twice+=i;
			}else {
				once+=i;
			}
		}
		System.out.println("짝수의 합"+twice);
		System.out.println("홀수의 합"+once);
		
		
	}
}
