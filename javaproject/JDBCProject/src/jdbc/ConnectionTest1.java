package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest1 {

	public static void main(String[] args) {
		// 패키지는 소문자로 하자 언더바나 하이픈도 쓰지 않는다.
		try {
			// 1. 드라이버 로드 : class.forName("클래스의 풀네임")
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. connection 객체를 생성 : 연결 정보
			// jdbc url
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "TIGER");

			if (conn != null) {
				System.out.println("데이터베이스 연결");
				conn.close(); // 자원의 반납
			}

		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}

