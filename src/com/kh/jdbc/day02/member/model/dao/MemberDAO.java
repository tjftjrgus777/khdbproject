package com.kh.jdbc.day02.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.jdbc.day01.student.model.vo.Student;
import com.kh.jdbc.day02.member.model.vo.Member;
// DAO data access object 데이타 (DB)에 접근 할 수 있는 객체다
public class MemberDAO {
	 private String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	 private String USER = "MEMBER";
	 private String PASSWORD = "MEMBER";
	 private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	public List<Member> selectAll() {
		String sql = "SELECT * FROM MEMBER_TBL";
		List<Member> mList = null ;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>();
//			 위에거 사용하지 않으면 java.lang.NullPointerException
			while(rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setGender(rset.getString("MEMBER_GENDER"));
				member.setAge(rset.getInt("MEMBER_AGE"));
				member.setEmail(rset.getString("MEMBER_EMAIL"));
				member.setPhone(rset.getString("MEMBER_PHONE"));
				member.setAddress(rset.getString("MEMBER_ADDRESS"));
				member.setHobby(rset.getString("MEMBER_HOBBY"));
				member.setDate(rset.getTimestamp("MEMBER_DATE"));
				mList.add(member);
			}
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
		return mList;
	}
	
	public int insertMember(Member member) {
//		String sql="INSERT INTO MEMBER_TBL VALUES('"+member.getMemberId()+"', '"+member.getMemberPwd()+"', '"+member.getMemberName()+"', '"+member.getGender()+"', "+member.getAge()+", '"+member.getEmail()+"', '"+member.getPhone()+"', '"+member.getAddress()+"', '"+member.getHobby()+"', DEFALULT";
		String sql = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,?,?,?,DEFAULT)";
		int result =0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getGender());
			pstmt.setInt   (5, member.getAge());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getPhone());
			pstmt.setString(8, member.getAddress());
			pstmt.setString(9, member.getHobby());         // 쿼리문 실행준비
			result = pstmt.executeUpdate();				   // 쿼리문 실해, sql 필요없음!					
//			Statement stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql);
//			stmt.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	public int deleteMember(String memberId) {
		String sql = "DELETE FROM MEMBER_TBL WHERE MEMBER_ID = ?";
		int result = 0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId); // 쿼리문 실행 준비
			result = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}














