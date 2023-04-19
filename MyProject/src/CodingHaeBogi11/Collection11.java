package CodingHaeBogi11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection11 implements Comparable<Collection11> {
	private String name;
	private int number;
	private String team;
	private int age;

	public Collection11(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Collection11 o) {
		
		int result = 0;
		
		result = team.compareTo(o.getTeam());
		if(result == 0) {
			result = name.compareTo(o.getName());
			if(result == 0) {
				if(number == o.getNumber()) {
					result = 0;
				}else {
					result = number - o.getNumber();
				}
			}
		}
		return result;
	}
	
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.team.charAt(team.length()-1%5);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		if(obj !=null && obj instanceof Collection11) {
			Collection11 sp = (Collection11)obj;
			return  team.equals(sp.getTeam())&& name.equals(getName())&&age==sp.getAge();
		}
		return result;
	}

	public static void main(String[] args) {
		List<Collection11>players = new ArrayList<>();  //1번 문제
		System.out.println("1번 문제");
		
		players.add(new Collection11("헨더슨", 6, "리버풀", 31));
		players.add(new Collection11("밀너", 7, "리버풀", 50));
		players.add(new Collection11("제라드", 8, "리버풀", 40));
		players.add(new Collection11("토레기", 9, "리버풀", 40));
		players.add(new Collection11("쿠통수", 10, "리버풀", 33));
		players.add(new Collection11("수아레스", 9, "리버풀", 35));
		players.add(new Collection11("아놀드", 66, "리버풀", 25));
		
		for(Collection11 player : players) {
			System.out.println("이름 : "+ player.name+" 등번호 : "+player.number
					+" 팀 : "+ player.team+" 나이 : "+ player.age );
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("2번 문제");
		
		HashSet<Collection11>playerHS = new HashSet();
		playerHS.add(new Collection11("헨더슨", 6, "리버풀", 31));
		playerHS.add(new Collection11("헨더슨", 6, "리버풀", 31));
		playerHS.add(new Collection11("밀너", 7, "리버풀", 50));
		playerHS.add(new Collection11("밀너", 7, "리버풀", 50));
		playerHS.add(new Collection11("제라드", 8, "리버풀", 40));
		playerHS.add(new Collection11("토레기", 9, "리버풀", 40));
		playerHS.add(new Collection11("쿠통수", 10, "리버풀", 33));
		playerHS.add(new Collection11("수아레스", 9, "리버풀", 35));
		playerHS.add(new Collection11("아놀드", 66, "리버풀", 25));
		
		for(Collection11 player : playerHS ) {
			System.out.println("이름 : "+ player.name+" 등번호 : "+player.number
					+" 팀 : "+ player.team+" 나이 : "+ player.age );
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("3번 문제");
		
		TreeSet<Collection11>playerTS = new TreeSet<>();
		playerTS.add(new Collection11("헨더슨", 6, "리버풀", 31));
		playerTS.add(new Collection11("파비뉴", 5, "리버풀", 31));
		playerTS.add(new Collection11("밀너", 7, "맨시티", 50));
		playerTS.add(new Collection11("", 7, "맨시티", 50));
		playerTS.add(new Collection11("제라드", 8, "LA갤럭시", 40));
		playerTS.add(new Collection11("토레기", 9, "첼시", 40));
		playerTS.add(new Collection11("쿠통수", 10, "바르셀", 33));
		playerTS.add(new Collection11("수아레스", 9, "바르셀", 35));
		playerTS.add(new Collection11("아놀드", 66, "리버풀", 25));
		
		for(Collection11 player : playerTS ) {
			System.out.println("이름 : "+ player.name+" 등번호 : "+player.number
					+" 팀 : "+ player.team+" 나이 : "+ player.age );
			System.out.println();
		}
		
		HashMap<String, Collection11> hashMap = new HashMap<>();
		
		hashMap.put("119", new Collection11("마르키시오", 8, "파란눈의 미남", 40));
		hashMap.put("010-8489-3121", new Collection11("토니 크로스", 8, "교수님 ", 35));
		
		System.out.println(hashMap.get("119").team);
		System.out.println(hashMap.get("010-8489-3121").team);
		
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName).name);
		}
		
		
		
		
	}


}




























