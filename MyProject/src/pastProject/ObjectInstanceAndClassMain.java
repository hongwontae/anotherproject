package pastProject;

public class ObjectInstanceAndClassMain {

	public static void main(String[] args) {

		ObjectInstanceAndCLASS cp1 =
				new ObjectInstanceAndCLASS("홍원태", "010-8489-3121", "행정학과", 2, "dnjsxoghd",
						"2월 23일", "의정부시 녹양동");
		ObjectInstanceAndCLASS cp2 = 
				new ObjectInstanceAndCLASS("루카스 모라", "010-1121-9112", "고양이과",
						50, "op.op.op");
		
			cp1.print();
			System.out.println();
			cp2.print();
		
		
		
	}

}
//private String name;
//private String number;
//private String major;
//private int grade;
//private String email;
//private String birthday;
//private String address;
