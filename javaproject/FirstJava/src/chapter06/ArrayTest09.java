package chapter06;

public class ArrayTest09 {

	public static void main(String[] args) {
		
		//Member 타입의 배열 생성을 하자. 요소는 5개 저장할 수 있도록
		Member[] members = new Member[5];
		
		
//		Member member 1 = new Member(1, "cool", "시원한");
		members[0] = new Member(1, "cool", "시원한"); //int string string이라 단순한 배열처리 힘듬
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "cha", "차두리 형님");
		
		//System.out.println(members[0].memberId);
		//System.out.println(members[0].memberName);
		//System.out.println(members[0].memberNo);
		//System.out.println(members[0].toString());
		//member[0] = Member 타입의 참조변수이다.
		//참조변수만 있으면 해당 객체의 멤버들을 사용할 수 있다.
		
		
		System.out.println("========== 회원 리스트========");
//		for(int i =0; i<members.length; i++) {
//			System.out.println(members[i]);
//		}
		
		for(Member member:members) {
			// member = members[0]~[4] 전체를 한다면 이렇게 한다.
			System.out.println(member);
		}


	}

}
