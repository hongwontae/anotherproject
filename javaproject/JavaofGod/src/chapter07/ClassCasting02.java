package chapter07;

public class ClassCasting02 {

	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		Phone phone1 = androidPhone;
		Phone phone2 = iPhone;
		IPhone iPhone1 = null;
		// 변수 phone2이 IPhone 타입으로 형 변환 가능 여부 판별
		if(phone2 instanceof IPhone) {
		iPhone1 = (IPhone) phone2;
		iPhone1.call();
		} else {
		System.out.println("자료형 변환이 불가합니다.");
		}
		IPhone iPhone2 = null;
		// 변수 phone1이 IPhone 타입으로 형 변환 가능 여부 판별
		if(phone1 instanceof IPhone) {
		iPhone2 = (IPhone) phone1;
		iPhone2.call();
		} else {
		System.out.println("자료형 변환이 불가합니다.");
		}

	}

}
