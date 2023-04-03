package chapter09;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println();
		System.out.println(str1.equals(str3)); //equals는 문자열을 비교한다.
		
		// 특정 타입의 데이터를 => String 타입으로 변경
		String str4 = ""+1;
		String str5 =  String.valueOf(1);
//		String str5 = new String();
		System.out.println(str5.toString());
		System.out.println();
		
		String str = "HELLO!";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.length()); //문자열의 길이 : 문자의 개수
		System.out.println();
		// index : 0~str.length()-1 이 될 것이다.
		
		//반복문
		//문자열 출력
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+"  ");
		}
		System.out.println();
		
		//역순으로 출력 5,4,3,2,1,0
		for(int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i)+"  ");
		}
		System.out.println();
		
		// compareTO 
		System.out.println();
		System.out.println(str.compareTo("HELLO!"));
		System.out.println(str.compareTo("HELLO!!"));
		System.out.println(str.compareTo("HELLO!!!"));
		
		System.out.println();
		//문자열을 붙인다.!! => ""+""=> concat(string s)
		System.out.println(str.concat(" JAVA!!"));
		
		System.out.println();
		//문자열에 특정 문자열을 포함여부 확인 => 논리값이 나온다.boolean
		System.out.println(str.contains("LO"));
		System.out.println(str.contains("fruits"));
		
		String file1 = "photo.jpg";
		String file2 = "java.pdf";
		
		if(file2.endsWith(".jpg")||file2.endsWith(".png")) {
			System.out.println("업로드가 가능합니다.");
		} else {
			System.out.println("확장자가 .jpg인 파일만 업로드가 가능합니다.");
		}
		System.out.println();
		
		
		//equals => 저장하고 있는 문자열을 비교한다.
		System.out.println(str.equals("HELLO!"));
		System.out.println(str.equals("asd"));
		System.out.println();
		
		//문자열의 사이즈 체크 : isEmpty(); => str.length() ==0 공백인지 아닌지
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		System.out.println();
		
		//문자열의 개수
		System.out.println(str.length());
		System.out.println();
		
		//특정 문자열을 치환
		System.out.println(str);
		System.out.println(str.replace("!", "~"));
		System.out.println(str.replace("HELLO!", "JAVA"));
		System.out.println();
	
		//시작하는 문자열 체크 : http://localhost:80/
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
		System.out.println();
		
		
		String domain = "http://localhost:80/";
		System.out.println(url.substring(7));
		System.out.println(url.substring(domain.length()));
		System.out.println();
		
		//trim은 공백제거 양쪽의 공백을 제거한다.
		String str7 = "     hello   java     ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
		
		
		
	}

}

















