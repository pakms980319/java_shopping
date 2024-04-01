package Ch38.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Ch38.Domain.Dto.BookDto;

public class BookDaoImpl {
	private String url = "jdbc:mysql://localhost:3306/bookdb";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public BookDaoImpl() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		
		System.out.println("[DAO] BookDaoImpl's Init Success");
		System.out.println("DB Connected...");
	}
	
	/*
	 * INSERT, SELECTALL, SELECTONE, DELETE, UPDATE
	 */
	
	public boolean Insert(BookDto dto) throws Exception {
		pstmt = conn.prepareStatement("INSERT INTO BOOK VALUES (?, ?, ?, ?)");
		
		pstmt.setInt(1, dto.getBookCode());
		pstmt.setString(2, dto.getBookName());
		pstmt.setString(3, dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		return result > 0;
	}
	
	public boolean Update(int bookCode, BookDto dto) throws Exception {
		pstmt = conn.prepareStatement("UPDATE BOOK SET bookCode=?, bookName=?, publisher=?, isbn=? WHERE bookCode=?");
		pstmt.setInt(1, dto.getBookCode());
		pstmt.setString(2, dto.getBookName());
		pstmt.setString(3, dto.getPublisher());
		pstmt.setString(4, dto.getIsbn());
		pstmt.setInt(5, bookCode);
		
		int result = pstmt.executeUpdate();
		
		return result > 0;
	}
	
	public List<BookDto> SelectAll() throws Exception {
		pstmt = conn.prepareStatement("SELECT* FROM BOOK");
		rs = pstmt.executeQuery();
		
		List<BookDto> list = new ArrayList<BookDto>();
		BookDto dto = null;
		
		if(rs!=null) {
			while(rs.next()) {
				dto = new BookDto(
						rs.getInt("bookCode"),
						rs.getString("bookName"),
						rs.getString("publisher"),
						rs.getString("isbn")
					);
				list.add(dto);
			}
		}
		
		rs.close();
		pstmt.close();
		
		return list;
	}
	
	public BookDto Select(int bookCode) throws Exception {
		pstmt = conn.prepareStatement("SELECT * FROM BOOK WHERE bookCode = ?");
		
		pstmt.setInt(1, bookCode);
		
		rs = pstmt.executeQuery();
		
		BookDto dto = null;
		
		if (rs!=null) {
			rs.next();
			dto = new BookDto(
					rs.getInt("bookCode"),
					rs.getString("bookName"),
					rs.getString("publisher"),
					rs.getString("isbn")
				);		
		}
		
		rs.close();
		pstmt.close();
		
		return dto;
	}
	
	public boolean Delete(int bookCode) throws Exception {
		pstmt = conn.prepareStatement("DELETE FROM BOOK WHERE bookCode = ?");
		pstmt.setInt(1, bookCode);
		
		int result = pstmt.executeUpdate();
		
		return result > 0;
	}
}
