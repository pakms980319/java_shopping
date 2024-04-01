package Ch20;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;


class Board implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + "]";
	}
	
}

public class C04ObjectStreamMain {
	public static void main(String[] args) throws Exception {
//		FileOutputStream out = new FileOutputStream("C:\\\\tmp_io\\\\board.db");
//		ObjectOutputStream oout = new ObjectOutputStream(out);
//		oout.writeObject(new Board(1, "제목1", "하2", "홍길동", new Date()));
//		oout.writeObject(new Board(2, "제목2", "하3", "서길동", new Date()));
//		
//		oout.flush();
//		oout.close();
//		out.close();
		
		/*
		 * 직렬화 에러
		 * 직렬화, 역직렬화 ? ( Serializable )
		 * 
		 */
		
		
		FileInputStream in = new FileInputStream("C:\\tmp_io\\board.db");
		ObjectInputStream oin = new ObjectInputStream(in);
		
		Object obj;	
		
		try {
			while( true ) {
				obj = oin.readObject();
				Board down = (Board) obj;
				System.out.println(obj);
			}
		} catch (EOFException e1) {
			System.out.println("Done...");
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
	}
}
