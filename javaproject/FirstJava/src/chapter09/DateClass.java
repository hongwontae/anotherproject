package chapter09;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println("현재 시간 : "+ now);
		
		Date date = new Date(1587317838379L);
		System.out.println("지정날짜 : "+date);
		

	}

}
