package pastProject;

public class ObjectInstanceAndCLASS {

	String name;
	String number;
	String major;
	String email;
	String birthday;
	String address;

	void print() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
		System.out.println("전공 : " + major);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + birthday);
		System.out.println("주소 : " + address);
	}

	ObjectInstanceAndCLASS(String name, String number, String major, String email, String birthday, String address) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	ObjectInstanceAndCLASS(String name, String number, String major, String email) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.email = email;
		this.birthday = "정의하지 않겠다";
		this.address = "정의하지 않겠다";

}
	
}
