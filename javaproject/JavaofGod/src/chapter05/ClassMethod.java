package chapter05;

public class ClassMethod {
	
	int iv=10; // 인스턴스 변수이다.
	
	static int cv = 30; //클래스 변수이다.
	
	//인스턴스 메서드이다.
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("Class Method");
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.iv); 
	}
	
	public static void main(String[] args) {
		
		//클래스 메서드의 호출 : 클래스 이름. 메서드이름() 멤버로 쓰는 중이라 클래스 명 생략가능.
		ClassMethod.printNumber2();
		
	}
	
	
	
	
}
