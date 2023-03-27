package chapter05.phone;

public class SmartPhone {

	// 인스턴스 변수
	String color;
	float size;
	int volume;
	
	//생성자 : 초기화 메서드, 인스턴스 변수의 초기화 작업을 한다.
	// 초기화 작업이 없는 경우 생략 가능하다.
	// 아래와 같은 생성자 = 기본 생성자라고 한다. 디폴트 생성자라고도 한다.
//	SmartPhone(){
//		System.out.println("인스턴스 생성!"); //이 문법을 제외하고 호출 방법없음. 단 한번 생성가능.
//	}
	
	//초기화를 위한 생성자 정의
	SmartPhone(String color, float size, int volume){
		this.color = color; //인스턴스 변수에 지역변수를 넣어야 하는데 이때 this 사용
		this.size = size;
		this.volume = volume;
	}
	
	SmartPhone(String color, float size){
		
		this(color, size, 0); // this() 다른 생성자를 호출하는 기능을 가진다.
		
//		this.color=color;
//		this.size=size;
//		this.volume = 0;
	}
	
	SmartPhone (){
		this("white", 4.5f,5);
//		color = "white";
//		size = 4.5f;
//		volume = 5;
	}
	

	void call() {
		System.out.println("전화 걸기");
	}

	void volumeUP() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}
}
