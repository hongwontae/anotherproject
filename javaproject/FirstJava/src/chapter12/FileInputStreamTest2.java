package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try {
			InputStream fin = new FileInputStream("D:\\Test.txt");

			int i = 0;
			while (true) {
				i = fin.read(); // 읽어올 데이터가 없다면 -1을 반환
				if (i == -1) {
					break;
				}
				System.out.print((char) i);
			}

			System.out.println();

			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");

		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}

	}

}
// 동기화 문제가 크다. 기준점이 없고 제멋대로이다.