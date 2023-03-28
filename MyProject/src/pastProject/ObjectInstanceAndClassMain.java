package pastProject;

public class ObjectInstanceAndClassMain {

	public static void main(String[] args) {
		
		ObjectInstanceAndCLASS sp1 = new ObjectInstanceAndCLASS("홍원태", "010-8489-3121",
				"행정학과", "dnjsxoghd@naver.com","2월 23일", "의정부시");
		ObjectInstanceAndCLASS sp2 = new ObjectInstanceAndCLASS("홍원태", "010-8489-3121",
				"행정학과", "dnjsxoghd@naver.com");
		
		sp1.print();
		System.out.println();
		sp2.print();
		

	}

}
