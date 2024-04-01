package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C03UPDATE {
	public static void main(String[] args) {
		// DB Conn Data
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testDB";
		
		// JDBC 참조변수
		Connection conn = null;						// DBMS 의 특정 DB 연결을 위한 참조변수
		PreparedStatement pstmt = null;				// SQL QUERY 를 전송용 참조변수
		ResultSet rs = null;						// SQL  쿼리 중 조회  결과 (SELECT 등)  수신용 참조변수
		
		// 드라이브 파일을 메모리 공간에 적재
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 사용하는 DBMS마다 다르다
			System.out.println("Driver Loading Success...");
						
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected....");
			
			pstmt = conn.prepareStatement("UPDATE TBL_STD SET NAME=? WHERE USERID=?");
			
			pstmt.setString(1, "HI");
			pstmt.setString(2, "user1");
			
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) System.out.println("UPDATE 성공");
			else System.out.println("UPDATE 실패");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }
			try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		
	}
}
