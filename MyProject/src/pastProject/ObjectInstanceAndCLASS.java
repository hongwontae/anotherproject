package pastProject;

public class ObjectInstanceAndCLASS {

	private String name;
	private String number;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	
	
	public ObjectInstanceAndCLASS(String name, String number, String major, int grade, String email, String birthday,
			String address) {
//		super();
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	public ObjectInstanceAndCLASS(String name, String number, String major, int grade, String email) {
//		super();
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}




	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
		System.out.println("전공 : " + major);
		System.out.println("학년"+grade);
		System.out.println("이메일 : " + email);
//		if(birthday !=null) {
//			System.out.println("생일 : " + birthday); //null
//		} else {
//			System.out.println("생일 : 미입력");
//		}
//		
		System.out.println("생일 : " +(birthday != null ? birthday : "미입력"));
		
		
//		if(address != null) {
//			System.out.println("주소 : " + address);
//		} else {
//			System.out.println("주소 : 미입력");}
//		}
//	
		System.out.println("조소 : "+ (address !=null ? address : "미입력"));
	


	}	
}
