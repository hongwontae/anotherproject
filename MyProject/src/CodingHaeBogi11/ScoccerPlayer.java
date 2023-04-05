package codingHaeBogi11;

import java.util.ArrayList;
import java.util.List;


public class SoccerPlayer {
	
	String name;
	int number;
	String team;
	int age;
	
	public static void main(String[] args) {
		List<SoccerPlayer> player = new ArrayList();
		
		SoccerPlayer SocerPlayer1 =  new SoccerPlayer();
		SoccerPlayer SocerPlayer2 =  new SoccerPlayer();
		SoccerPlayer SocerPlayer3 =  new SoccerPlayer();
		SoccerPlayer SocerPlayer4 = new SoccerPlayer();
		
		SocerPlayer1.name = "제라드";
		SocerPlayer1.number = 8;
		SocerPlayer1.team = "리버풀";
		SocerPlayer1.age = 40;
		
		SocerPlayer2.name = "트렌드알렉산더아놀드";
		SocerPlayer2.number = 66;
		SocerPlayer2.team = "리버풀";
		SocerPlayer2.age = 25;
		
		SocerPlayer3.name = "쿠티뉴";
		SocerPlayer3.number = 99;
		SocerPlayer3.team = "지옥";
		SocerPlayer3.age = 30;
		
		SocerPlayer4.name = "사비알론소";
		SocerPlayer4.number = 6;
		SocerPlayer4.team = "리버풀";
		SocerPlayer4.age = 40;
		
		player.add(SocerPlayer1);
		player.add(SocerPlayer2);
		player.add(SocerPlayer3);
		player.add(SocerPlayer4);
		
		System.out.println(player.get(0).name+"\t" + player.get(0).number+"\t" + player.get(0).team+"\t" + player.get(0).age);
		System.out.println();
		System.out.println(player.get(1).name+"\t" + player.get(1).number+"\t" + player.get(1).team+"\t" + player.get(1).age);
		System.out.println();
		System.out.println(player.get(2).name+"\t" + player.get(2).number+"\t" + player.get(2).team+"\t" + player.get(2).age);
		System.out.println();
		System.out.println(player.get(3).name+"\t" + player.get(3).number+"\t" + player.get(3).team+"\t" + player.get(3).age);
	}
}
