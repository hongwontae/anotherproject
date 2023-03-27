package chapter05.phone;

public class MemberName {

	public static void main(String[] args) {
		
		Member member1 = new Member("손흥민", "dnjsxoghd", 20, "01084893121"); 
		Member member2 = new Member("박지성", "kaoalal3121");
			
		member1.showData();
		System.out.println();
		member2.showData();
		
		

	}

}
