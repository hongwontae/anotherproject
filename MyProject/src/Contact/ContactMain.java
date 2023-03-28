package Contact;

public class ContactMain {

	public static void main(String[] args) {
		ClassContact c = new ClassContact("손흥민", "010-8489-3121",
				"dnjsxoghd@naver.com", "런던", "20210223", "친구");
		
		System.out.println("이름 : "+ c.getName());
		System.out.println("전화번호 : "+ c.getPhoneNumber());
		System.out.println("이메일 : "+c.getEmail());
		System.out.println("주소 : "+c.getAddress());
		System.out.println("생일 : "+c.getBirthday());
		System.out.println("그룹 : "+c.getGroup());
		
		System.out.println("-------------------------------------------");
		
		c.printData();
		
		c.setPhoneNumber("010-9999-8888");
		c.setEmail("google.gmail");
		c.setAddress("Madrid");
		c.setBirthday("1990-88-99");
		
		System.out.println();
		c.printData();
	}

}
