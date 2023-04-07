package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// 객체 저장
		Person person = new Person("kING", 20);
		String msg = "안녕하세요";
		
		ObjectOutputStream outPutStream = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			
			outPutStream = new ObjectOutputStream(fos);
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
