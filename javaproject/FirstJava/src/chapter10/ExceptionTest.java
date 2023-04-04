package chapter10;

public class ExceptionTest {

	public static void main(String[] args) { 
		
		try {
			Class.forName("Example");
			} catch(ClassNotFoundException e) {
				System.out.println("클래스를 찾지 못했습니다.");
			}
		
		
		
		int [] numbers= {1,2,3,4,5,};
		
		// ArrayIndexOutOfBoundsException index범위 벗어남.
		try {
			System.out.println(numbers[5]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("사용가능한 인덱스 범위를 벗어났습니다.");
				e.printStackTrace();
			}
		System.out.println();
		try {
			numbers = new int[-10];
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 생성시에는 배열의 사이즈가 0보다 커야 합니다.");
			e.printStackTrace();
		}
		
		System.out.println();
		
		String str = null;
		try {
			str.trim();
		} catch(NullPointerException e) {
			System.out.println("참조값은 null이면 안됩니다.");
		}
		
	
		
		
		

	}

}
