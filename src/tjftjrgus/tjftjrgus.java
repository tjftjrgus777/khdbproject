package tjftjrgus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.kh.jdbc.day02.member.model.vo.Member;


	public class tjftjrgus {
		 private String URL ="jdbc:oracle:thin:@localhost:1521:XE";
		 private String USER = "MEMBER";
		 private String PASSWORD = "MEMBER";
		 private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		 public Member member = new Member();
		public Member selectAll() {
			String sql = "SELECT * FROM MEMBER_TBL";
			try {
				Class.forName(DRIVER_NAME);
				Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rset = stmt.executeQuery(sql);
				while(rset.next()) {
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
			return member;
		}

	}
