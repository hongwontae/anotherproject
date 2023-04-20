package com.main;

import java.sql.SQLException;
import java.util.ArrayList;
import com.dto.Dept;
import com.service.OracleService;

public class TestMain {
	public static void main(String[] args) {
		OracleService service = new OracleService();
		ArrayList<Dept> list = new ArrayList<>();
		try {
			list = service.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}
}