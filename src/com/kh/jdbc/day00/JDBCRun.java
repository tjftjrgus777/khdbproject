package com.kh.jdbc.day00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRun {
	public static void main(String []args) {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user="KH";
			String password ="KH";
			String sql = "SELECT * FROM EMPLOYEE";
			// 1. 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결 생성
			Connection conn = DriverManager.getConnection(url,user,password);
			// 3. 쿼리문 실행준비(Statement 객체 생성)
			Statement stmt = conn.createStatement();
			// 4. 쿼리문 실행
			ResultSet rset = stmt.executeQuery(sql);
			// 후처리 - 디비에서 가져온 데이터 사용
			while(rset.next()) {
				System.out.println("사원 아이디 : " + rset.getString("EMP_ID"));
			}
			// 자원해제
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
