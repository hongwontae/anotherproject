package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest2 {

	public static void main(String[] args) {
		// 패키지는 소문자로 하자 언더바나 하이픈도 쓰지 않는다.
		try {
			// 1. 드라이버 로드 : class.forName("클래스의 풀네임")
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. connection 객체를 생성 : 연결 정보
			// jdbc url
			// my sql 연결
			String dbUrl1 = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl1, "himidia", "tiger");
			
			// 3. Stastement / PreparedStatemnet => sql 실행 요청 메서드
			
			// 4.select의 결과 데이터는 ResultSet 객체로 받는다.
			
			// 5. ResultSet 객체에서 데이터 추출

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
