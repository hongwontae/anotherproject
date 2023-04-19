package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest1 {

	public static void main(String[] args) {
		// 패키지는 소문자로 하자 언더바나 하이픈도 쓰지 않는다.
		try {
			// 1. 드라이버 로드 : class.forName("클래스의 풀네임")
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. connection 객체를 생성 : 연결 정보
			// jdbc url
			
			// 3. Statement /PreparedStatement => sql 실행 요청 메서드
			
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "TIGER");
			
			Statement stmt = conn.createStatement();
			// sql
			String sql = "select * from dept";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
			rs.close();
			conn.close();
			
			


		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}

