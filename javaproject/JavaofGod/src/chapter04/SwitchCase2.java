package chapter04;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		//사용자에게 권한을 줄 것이다. 
		// 일반 유저  = 읽기기능
		// 매니저 = 일기, 쓰기 가능
		// 관리자 = 일기, 쓰기, 삭제
		
		String grade = "user"; //관리자, 매니저, 유저
		
		switch(grade) {
		case "admin" : System.out.println("삭제 기능 사용 가능");
		
		case "manager" : System.out.println("쓰기 기능 사용 가능");
		
		case "user" : System.out.println("읽기 기능 사용 가능");
		}
		

	}

}
