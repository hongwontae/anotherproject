package chapter09;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class SystemCurrentTimMillis {

	public static void main(String[] args) {
		
		//특정 직업의 처리 시간 체크 : 성능 체크
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		//처리
		int sum = 0;
		for(int i=0; i<100000000; i++) {
			int n1 =1;
			int n2 = 2;
			sum+=i;
		}
		
		long endTime = System.currentTimeMillis();
		long result = endTime - startTime;
		System.out.println("실행 시간 : "+ result+"ms");
		

	}
}
