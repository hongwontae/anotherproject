package chapter05;

public class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void tell() {
		System.out.println("안녕하세요 "+age+" 살"+"입니다.");
	}

}
