package api;

import java.util.Scanner;

public class Exam3Main {

	public static void main(String[] args) {
		// 사용자에게 이름을 입력 받아 (scanner)
		// 입력 받은 문자열을 정상적인 문자열(영문자)의 이름으로 표현하는지 판별하고,
		// 공백으로 입력되었는지도 판별하는 String trim() >> isempty
		// 프로그램을 만들어봅시다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. >>>>>");
		String name = sc.nextLine();
		
		if(name.trim().isEmpty()) {
			System.out.println("공백입력을 허용하지 않습니다.");
		} else {
			if(checkName(name)) {
				System.out.println(name);
			} else {System.out.println("영문자 대문자와 소문자만 입력 가능합니다.");}
			
		}

	}
	
	//전달받은 문자열이 영문자로 되어 있는지 판별해보자. : a~z, A~Z
	static boolean checkName(String name) {
		boolean result = true;
		
		//전달받은 문자열중에 영문자가 아닌 문자를 포함하고 있다면 
		//result에 false;
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(c>='a'&& c<='z' || c>='A'&& c<='Z') {
				result  = false;}
		}
	
		return result;
	}

}
