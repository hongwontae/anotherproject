package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {
	public static void main(String[] args) {

		// 복사를 위해서는 - 원본 파일(파일 데이터를 읽어와야한다.)
		// 복사본 : 원본파일의 데이터를 써야한다.

		try {
			InputStream in = new FileInputStream("D:\\Test.zip");
			OutputStream out = new FileOutputStream("D:\\TestCopy1.zip");

			// 카피한 파일의 사이즈

			int copy1Byte = 0;
			// 배열에 담기는 데이터의 사이즈
			int byteDataSize = 0;
			// 데이터를 담아서 전송할 배열
			byte[] bufData = new byte[1024 * 2];
			// 2kb 사이즈의 배열을 생성, 데이터를 배열에 저장해서 읽고 쓴다.

			System.out.println("파일 복사 시작");

			while (true) {

				byteDataSize = in.read(bufData);
				// 전달한 배열에 byte 데이터를 담고 몇개 데이터를 전달하는지 개수를 반환해준다.
				// 더 이상 보낼 데이터가 없으면 -1을 반환한다.
				if (byteDataSize == -1) {
					break;
				}
				
				
				// 파일의 데이터를 쓴다.
				out.write(bufData, 0, byteDataSize);

				copy1Byte += byteDataSize; //복사한 파일의 사이즈 증가 연산

			}
			in.close();
			out.close();
			System.out.println("복사가 완료되었습니다."+copy1Byte+"byte");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
