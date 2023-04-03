package chapter09;

public class ObjectClassa {
	public static void main(String[] args) {
		
		car c1 = new car("2023A001");
		car c2 = new car("2023B001");
		car c3 = c1;
		car c4 = new car("2020A001");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
	}

}


class car{
	
	String carNo;
	car(String carNo){
		this.carNo=carNo;
	}

	@Override
	public boolean equals(Object obj) {
		//obj => null < =false
		
		//obj  => car 타입으로 형변환이 가능해야 한다!
		//obj => 형변환 하고 carNo을 비교해서 결과값을 반환하는 형태	
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carNo +"차량입니다.";
	}
	
	
	
}
