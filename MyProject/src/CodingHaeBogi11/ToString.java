package CodingHaeBogi11;

public class ToString {

	String name;
	int position;

	public ToString(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}

	@Override
	public String toString() {
		
		return String.format("자동차(이름 = %s , 위치 = %s)", name, position);
	}
	
	public static void main(String[] args) {
		ToString sp1 = new ToString("손선생", 50);
		System.out.println(sp1);
		
		Object o = new Object();
		System.out.println(o.toString());
		
		
		
		
		
	}


}

//tostring();메서드는 클래스이름@16진수로 표시된 해시코드 형태의 문자열을 반환한다.

// tostring을 항상 재정의 하자.

// tostring을 재정의하여(오버라이딩)하여 사용하면 필드 값들의 정보를 문자열로 출력할 수 있도록 해준다.