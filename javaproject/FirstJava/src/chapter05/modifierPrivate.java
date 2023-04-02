package chapter05;

public class modifierPrivate {
	
	private String name; //같은 클래스 내부에서만 접근 가능
	private int age;
	
	public modifierPrivate(String name, int age) {
		this.name=name;
		this.age = age;
	}
	
	//은닉된 변수들은 정해진 메소드을 통해서 엑세스, 설정하게 한다.!
	//Getter/ Setter
	
	//getter
	public String getName() {
		return this.name;
	}
	
	//setter 특정값을 변경하고자 한다.
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	void tell() {
		System.out.println("아메리카노 좋아"+age+"아이스 아메리카노"+name);
	}
}
