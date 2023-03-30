package chapter05;

public class InstanceVariable {

	String name = "king";
	int age = 12;

	void tellName() {
		System.out.println("나의 이름은 " + name + " 입니다.");
		System.out.println("나의 이름은 "+ ClassVariable.name+"입니다.");
	}

	void tellAge() {
		System.out.println("나는 " + age + "살 입니다.");
	}

	public static void main(String[] args) {
		// 인스턴스 변수는 인스턴스를 생성했을 때 생성한다. - 인스턴스가 소멸될 때 소멸된다.
		InstanceVariable lv = new InstanceVariable();
		System.out.println(lv.name);
		System.out.println(lv.age);
		System.out.println();

		lv.tellAge();
		lv.tellName();

	}
				//static은 거의 사용하지 않는다.
}
