package chapter05;

public class ClassVariable2 {
public static void main(String[] args) {
	
	System.out.println(ClassVariable.name);
	System.out.println(ClassVariable.age);
	
	ClassVariable cv = new ClassVariable();
	cv.tellName();
	cv.tellAge(); //인스턴스 변수는 가져오려면 윗 문장을 작성 static은 그냥 써도 된다.
	
	
}
}
