package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.net.aso.q;
import oracle.net.aso.r;

public class InsertTest {

	public static void main(String[] args) {
		// 패키지는 소문자로 하자 언더바나 하이픈도 쓰지 않는다.
		try {
			// 1. 드라이버 로드 : class.forName("클래스의 풀네임")
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. connection 객체를 생성 : 연결 정보
			// jdbc url
			String dbUrl1 = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl1, "himidia", "tiger");

			// 3. statement / prpa 
			
			// insert sql
			String sql = "update dept set dname=?,loc=? where deptno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "디자인팀");
			pstmt.setString(2, "제주도");
			pstmt.setInt(3, 50);
			
			
			
			int result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println("데이터가 수정되었습니다.");
			}
			
			pstmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			//System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}
