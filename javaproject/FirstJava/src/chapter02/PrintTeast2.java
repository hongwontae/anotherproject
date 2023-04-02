package chapter02;

public class PrintTeast2 {

	public static void main(String[] args) {
		
	
		//안녕하세요. 저는 JAVA입니다.
		//저는 20살 입니다.
		//정수:10, 실수:13.500000
		//문자:z, 문자열:king
		System.out.print("안녕하세요! 저는");
		System.out.print("손흥민");
		System.out.print("입니다.");
		System.out.println();
		System.out.printf("안녕하세요. 저는 %s입니다.\n", "JAVA"); 
		System.out.printf("저는 %d살 입니다. %n", 20); 
		System.out.printf("정수:%d, 실수:%f %n", 10,13.4444);
		System.out.printf("문자:%c, 문자열:%s \n", '문', "문자열");
	}

}
