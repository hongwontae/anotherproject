package CodingHaeBogi11;

import java.util.HashSet;

public class FootballPlayer2 {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer2(String name, int number, String team, int age) {

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
	public int hashCode() {

		return name.charAt(name.length() - 1);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof FootballPlayer2) {
			FootballPlayer2 s = (FootballPlayer2) obj;
			result = name.equals(s.getName());
		}
		return result;
	}

	@Override
	public String toString() {
		return "FootballPlayer2 [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age
				+ "]";
	}
	public static void main(String[] args) {
		HashSet<FootballPlayer2> player = new HashSet();
		
		player.add(new FootballPlayer2("손흥민", 010, "안중근", 222));
		player.add(new FootballPlayer2("손흥민", 010, "안중근", 222));
		player.add(new FootballPlayer2("안지연", 4444, "리버풀", 9898));
		player.add(new FootballPlayer2("안지연", 3333, "리버풀", 2289));
		player.add(new FootballPlayer2("제임스밀너", 3333, "리버풀", 2289));
		player.add(new FootballPlayer2("제ㅁㄴㅇ", 3333, "리버풀", 2289));
		
		
		System.out.println(player.size());
		
		for(FootballPlayer2 sp1:player) {
			System.out.println(sp1);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}