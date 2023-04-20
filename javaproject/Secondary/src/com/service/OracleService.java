package com.service;
import java.sql.*;
import java.util.ArrayList;
import com.dao.OracleDAO;
import com.dto.Dept;
public class OracleService {
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "hr";
	String passwd = "TIGER";
	OracleDAO dao;
	public OracleService() {
		dao = new OracleDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Dept> select() throws SQLException {
		Connection con = null;
		ArrayList<Dept> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.select(con); 
		} finally {
			if(con!=null) con.close();
		}
		return list;
	}
}