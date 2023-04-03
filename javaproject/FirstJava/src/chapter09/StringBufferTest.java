package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		System.out.println();
		//append 
		//sb.append('~');
		//System.out.println(sb);
		//sb.append(" java");
		sb.append('~').append(" java");
		System.out.println(sb);
		
		//삭제 delete
		sb.delete(5, 7); // 지워주는 것은 5~(7-1)
		System.out.println(sb);
		
		// insert 중간에 들어가기
		sb.insert(5," ");
		System.out.println(sb);
		sb.insert(6, '~');
		System.out.println(sb);
		
		System.out.println();
		
		sb.insert(sb.length(), false);
		System.out.println(sb);
		
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		String result = new String(sb);
		System.out.println(result);
		
		//stringbuffer와 stringbulider는 같다. 동기화 차이만 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
