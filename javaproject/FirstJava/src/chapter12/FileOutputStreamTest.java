package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		try {
			FileOutputStream out = new FileOutputStream("D:\\Test.txt");
			out.write(65);
			out.close(); // i/에서는 스트림 사용 후 반드시 받아 준다.
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
