package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTestMain {

	public static void main(String[] args) {

		try {
			OutputStream out = new FileOutputStream("D:\\Test1.txt");
			String str = "Hi!";
			byte[] arr = str.getBytes(); // string 클래스의 문자열의 byte배열을 반환받은 것이다.
			out.write(arr);

			out.close();
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
