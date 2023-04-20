package com.dao;

import java.sql.*;
import java.util.ArrayList;
import com.dto.Dept;

public class OracleDAO {
	public ArrayList<Dept> select(Connection con) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Dept> list = new ArrayList<>();
		try {
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				list.add(new Dept(deptno, dname, loc));
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
		}
		return list;
	}
}