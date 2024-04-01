package Ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DBConn {

	public static void main(String[] args) throws SQLException {
		//DB연결정보 저장용 변수
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/tmpdb";
		
		//JDBC참조변수	
		Connection conn=null;			// DB연결용 참조변수
		PreparedStatement pstmt = null;	// SQL쿼리 전송용 참조변수
		ResultSet rs = null;			// SQL쿼리 결과(SELECT결과) 수신용 참조변수
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	//드라이브 적재
			System.out.println("Driver Loading Success..");
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected..");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		

	}

}