package chapter02;

public class byteOverflow {

	public static void main(String[] args) {
		
		// 우리가 다루어야 하는 데이터의 범위에 따라서 타입설정이 달라져야 한다.
		// 0~270
		byte b =0;
		int i = 0;
		
		// 0~1씩 다해서 270까지 증가시키는 코드를 작성하자.
		//for(초기식, 비교식, 증감식) (반복해야 하는 코드식)
		for(int x=0; x<=270; x++) {
		//System.out.println(x);
			
		//b=b+1;
		b++;
		i++;
		System.out.println(b+"\t"+i);
		
			
			
		}
		
		
	}

}
