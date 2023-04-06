package alexanderAronld;

public class Memethod {
	
	void poweOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	public static void main(String[] args) {
		
		Memethod sp1 = new Memethod();
		
		sp1.poweOn();
		
		System.out.println(sp1.plus(10, 5));
		
		System.out.println(sp1.divide(10, 5));
		
		sp1.powerOff();
		

	}

}

// 메서드 : 반환타입 메서드 이름(매개변수){실행코드}
// 반환값 x = void, 반환값 o = 타입
// 매개 변수 선언 : 메서드가 실행할 떄 필요한 데이터를 외부로부터 받기 위해 사용된다.
// 메서드 매개변수가 있을 때 타입과 개수를 맞춰줘야 한다. but 자동 타입 변환이 되는 경우는 예외이다.
// 메서드 반환 타입과 매개변수 타입이 달라도 괜찮다. 매개변수 타입이 다르기 들어오면 안된다.


// 메서드를 선언할 때 매개 변수의 개수를 알 수 없는 경우
// void가 있는 경우 return을 사용할 수 있는데 이는 메서드 실행을 강제 종료시키는 것이다.
// 메서드 호출 = 클래스 내부나 외부의 호출에 의해 실행된다.
// 외부에서 호출할 때는 참조변수를 이용해서 메서드를 호출해야 한다.
// 같은 클래스 내부에서 메서드를 호출할 때   메서드 명(매개타입) =>이렇게 적으면 된다.


// 메서드 오버로딩 : 클래스 내에 같은 이름의 매소두룰 여러 개 선언하는 것을 말한다.
// 오버로딩의 조건은































