package chapter11;

public class MyClass<T> {
	
	// 타입이 들어갈 수 있는 곳은 변수, 메서드의 반환타입, 매개변수의 타입
		T val;
		
		T getVal() {
			return val;
		}
		
		void setVal(T val) {
			this.val = val;
		}

		public static void main(String[] args) {
			MyClass<String> myClass = new MyClass <String>(); 
			myClass.setVal("king");
			//잘못된 타입이 저장되지 않도록 처리가 된다.
			// string 타입의 데이터만 반환!
			System.out.println(myClass.getVal());
		}
	
}
