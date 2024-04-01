package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

class Student {
	private String userid;
	private String password;
	private String name;
	
	public Student(String userid, String password, String name) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [userid=" + userid + ", password=" + password + ", name=" + name + "]";
	}
	
}

public class C06TxMain {
	
	final static String id = "root";
	final static String pw = "1234";
	final static String url = "jdbc:mysql://localhost:3306/testDB";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Resultset rs = null;
	
	public static boolean Insert(Student student) throws SQLException {
		return false;
	}
	
	public static boolean Insert(List<Student> list) throws SQLException {
		conn.setAutoCommit(false);
		for(Student student : list) {
			pstmt = conn.prepareStatement("insert into tbl_std values(?,?,?)");
			pstmt.setString(1, student.getUserid());
			pstmt.setString(2, student.getPassword());
			pstmt.setString(3, student.getName());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("INSERT 성공");
			}
			else {
				System.out.println("INSERT 실패");
			}		
		}
		conn.commit();
		return true;
	}
	
	public static boolean Init() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Sucess...");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB Connected...");
		
		return true;
	}
	
	public static void destroy() {
		
		
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("aaa", "111", "a"));
		list.add(new Student("bbb", "222", "b"));
		list.add(new Student("ccc", "333", "c"));
		list.add(new Student("bbb", "222", "b"));
		
		try {
			if (!Init()) {
				System.out.println("DB 연결 실패");
			}
			
			Insert(list);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
	}
}

