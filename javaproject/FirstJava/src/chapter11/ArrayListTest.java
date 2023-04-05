package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Integer>numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		
		Iterator<Integer> itr = numbers.iterator();
		System.out.println("Iterator를 이용한 전체 참조");
		while(itr.hasNext()) {
			int num = itr.next();
//			System.out.println(itr.next()); 
//			System.out.println(100+itr.next()); 이거는 오류가 난다.
			System.out.println(num+100);
		}
		
		System.out.println();
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
				
		System.out.println();
		

		// Collection<E> List<E> => ArrayList<E>
		//String 타입의 객체를 저장한다. => String 타입의 인스턴스를 참조하는 참조값을 저장
		ArrayList<String> list = new ArrayList<String>();
		
		// 인스턴스 저장 => 요소를 저장한다. .add()
		list.add("손흥민");
		list.add(new String ("박지성"));
		list.add("이강인");
		
		// 데이터 참조 : get()
		//String name = list.get(10);
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println();
	
		
		// 특정위치의 요소 삽입
		list.add(1, "안정환"); // 기존에 있던 거는 뒤로 바꾸한다.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : "+ list.size());
		System.out.println("index : 0~"+(list.size()-1));
		
		System.out.println();
		
		// 반복문을 이용해서 일괄처리 해보자.
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i)+" : "+ list.get(i).charAt(0));
		} 
		
		System.out.println();
		
		for(String player : list) {
			System.out.println(player+" : "+player.charAt(2));
		}
		
		System.out.println();
		
		if(list.contains("손흥민")) {
			System.out.println("잘하자 흥민아");//boolean이다. 이거 있니? 물어보는 것.
		} 
		
		System.out.println();
		
		if(list.contains("안정환")) {
			// 안정환 선수는 하차!
			list.remove("안정환"); // String으로 삭제
			list.remove(0); //index로 삭제
		}
		
		for(String player : list) {
			System.out.println(player+" : "+player.charAt(2));
		}
		
		System.out.println();
		
		// 전체 요소를 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}













