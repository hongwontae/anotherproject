package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {

	public static void main(String[] args) {
		// 패키지는 소문자로 하자 언더바나 하이픈도 쓰지 않는다.
		try {
			// 1. 드라이버 로드 : class.forName("클래스의 풀네임")
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. 생략해도 된다.

			// 2. connection 객체를 생성 : 연결 정보
			// jdbc url
			// oracle 연결
			String dbUrl1 = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl1, "hr", "TIGER");
			
			// sql
			String sql = "Select * from dept where deptno =? and dname=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 파라미터 설정
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ACCOUNTING");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "\t"+
			rs.getString(2)+"\t"+ rs.getString(3));
			}
			
			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}
