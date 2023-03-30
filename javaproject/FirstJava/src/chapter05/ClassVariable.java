package chapter05;

public class ClassVariable {
	static String name = "king";
	static int age = 10;

	void tellName() { // static으로 한다 하더라도 이름만 적어도 된다.
		System.out.println("나의 이름은 " + name + "입니다."); // 클래스 멤버도 인스턴스 처럼 같은 멤버로 인식한다.
	}

	void tellAge() {
		System.out.println("나는 " + age + "살 입니다.");
	}

	public static void main(String[] args) {

		System.out.println("이름" + ClassVariable.name);
		System.out.println("나이"+ClassVariable.age);
	}
}
