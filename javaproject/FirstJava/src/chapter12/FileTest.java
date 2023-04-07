package chapter12;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		
		File file1 = new File("d:\\Test.txt");
		File dir1 = new File("d:\\Tests.txt");
			
		System.out.println(dir1.exists());
		
		if(!dir1.exists()) {
			// 폴더가 존재하지 않으면 폴더를 생성하자.
			dir1.mkdir();
			System.out.println("d 드라이브에 tests 폳더를 생성....");
		}
		
		if(file1.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 없습니다.");
		}
		
		File dir2 = new File("D:test\\");
		File newFile = new File("D:\\Test", "Test-Text2.txt");
		File newFile2 = new File(dir2,"Test=Test2.txt");
		
		System.out.println("파일 여부 확인 : "+ newFile.isFile());
		System.out.println("폴더 여부 확인 : " + dir1.isDirectory());

	}

}
