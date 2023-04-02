package FirstJavaTest06;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student 타입의 배열 생성 : 데이터 10개 저장가능
		Student[] students = new Student[10];
		students[0] = new Student("son01",100,10,100);
		students[1] = new Student("son01",90,20,100);
		students[2] = new Student("son01",80,30,100);
		students[3] = new Student("son01",70,40,100);
		students[4] = new Student("son01",60,50,100);
		students[5] = new Student("son01",50,60,100);
		students[6] = new Student("son01",40,70,100);
		students[7] = new Student("son01",30,80,100);
		students[8] = new Student("son01",20,90,100);
		students[9] = new Student("son01",10,100,100);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("========================================================");
		for (Student student :students) {
			System.out.println();
		}


		

	}

}
