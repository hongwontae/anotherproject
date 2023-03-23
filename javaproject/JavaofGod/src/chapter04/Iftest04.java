package chapter04;

public class Iftest04 {

	public static void main(String[] args) {
		// 특정 숫자의 판별을 하는 : 양수이냐 음수이냐 0이냐
		
		int number = -3;
		// 양수 : 0보다 큰 수
		// 음수 : 0보다 작은 수
		// 0보다 크지도 작지도 않은 수는 0
		if(number>0) {System.out.println("양수");}
		else if (number<0) {System.out.println("음수");}
		else {System.out.println("0");}
	}

}
