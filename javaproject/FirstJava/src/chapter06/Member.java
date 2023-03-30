package chapter06;

public class Member {

	int memberNo;
	String memberId;
	String memberName;

	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

//	@Override
//	public String toString() { //멤버가 오브젝트를 상속한다. 
//		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberName=" + memberName + "]";
//	}
	@Override
	public String toString() { //멤버가 오브젝트를 상속한다. 
		return "회원 [회원번호=" + memberNo + ", 회원 아이디=" + memberId + ", 회원이름=" + memberName + "]";
	}

}
