package chapter05;

public class ModifierProtected {
	
	protected String name; //접근자 default
	protected int age;	//접근자 default
	
	protected void tell() {
		System.out.println("안녕하세요"+age+"살"+name+"입니다.");
	}
	
}
