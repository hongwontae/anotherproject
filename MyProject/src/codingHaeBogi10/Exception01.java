package codingHaeBogi10;

public class Exception01 {

	public static void main(String[] args) {
//		
//		System.out.println(1);
//		try {
//			System.out.println(0/0);
//			System.out.println(2);
//		} catch(ArithmeticException e) {
//			System.out.println("0 나누면 안됩니다.");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("33");
		
		
		
//		try {
//			Exception e = new Exception("고의로 발생시켰다.");
//			throw e;
//		} catch(Exception e) {
//			System.out.println("에러 메시지 "+ e.getMessage());
//			e.printStackTrace();
//			}
//		System.out.println("프로그램 종료");
//
//		
	}

}

//프로그램 오류는 크게 3가지 종류로 구분한다.
//1. 컴파일 에러
//2. 런타임 에러 (error: 심각한 에러, exception : 미약한 에러)
//3. 논리적 에러
//예외처리는 exception을 대비하는 것이다.
//try {} 중괄호 안은 실행한다. exception면 catch로 가서 확인하고 실행한다.if랑 비슷하다.

// 위 메인 메서드를 보면 2는 콘솔에 나오지 않는다.
// (0/0)에서 바로 catch로 내려가고 다시 올라가지 않는다.
// exception은 모든 예외의 최고조상임으로 모든 예외가 다 처리된다.

//예외가 발생되었을 때, 생성된 예외 객체 타입과 catch 블럭의 참조변수 타입이 일치하면
// 해당 catch 블락이 발생한 예외를 처리하게 된다.
// 그러면 printstacktrace와 getmessage사용 가능하게 된다.
// print = return값 존재하는 메서드라 sysout x = 예외가 어디서 일어났니?
// getmessage = void라 sysout o = 예외 메시지를 알 수 있다.


// 직접 예외를 발생시킬 수 있다.
// 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
// Exception e = new Exception("고의로 발생");
// 2. 키워드 throw를 이용해서 예외를 발생시킨다.
// throw e;






















