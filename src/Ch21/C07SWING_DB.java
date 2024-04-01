package Ch21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
class GUI extends JFrame implements ActionListener, KeyListener, MouseListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JTextField txt1;

	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;
	
	JPanel panel;
	JScrollPane selectScroll;
	JTable table;
	
	// DB INSERT FRAME_WINDOW
	JFrame Frm_Insert;
	JFrame Frm_Update;
	JFrame Frm_Delete;
	JFrame Frm_Select;

	// DB연결정보 저장용 변수
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3306/testdb";
	
	// JDBC참조변수
	Connection conn = null; // DB연결용 참조변수
	PreparedStatement pstmt = null; // SQL쿼리 전송용 참조변수
	ResultSet rs = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
	
	// Table 의 수정될 Row 저장용 LIST
	List<Integer> modifiedRowList;
	
	GUI() {
		// Frame
		super("프레임창입니다");
		setBounds(100, 100, 550, 400);

		// Panel
		panel = new JPanel(); // 패널생성
		panel.setLayout(null);

		// Component
		btn1 = new JButton("IO_저장하기");
		btn2 = new JButton("IO_불러오기");
		btn3 = new JButton("DB_INSERT");
		btn4 = new JButton("DB_UPDATE");
		btn5 = new JButton("DB_DELETE");
		btn6 = new JButton("DB_SELECT");
		txt1 = new JTextField();
		txt2 = new JTextField();
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		table = new JTable();	
		selectScroll = new JScrollPane(table);

		// Positioning
		txt1.setBounds(10, 270, 350, 30);
		btn1.setBounds(370, 10, 120, 30);
		btn2.setBounds(370, 50, 120, 30);
		btn3.setBounds(370, 90, 120, 30); // DB_INSERT
		btn4.setBounds(370, 130, 120, 30); // DB_UPDATE
		btn5.setBounds(370, 170, 120, 30); // DB_UPDATE
		btn6.setBounds(370, 210, 120, 30); // DB_UPDATE
		scroll1.setBounds(10, 10, 350, 250);
		selectScroll.setBounds(10, 10, 350, 250);
		
		// Event 처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		btn3.addActionListener(this); // DB
		btn4.addActionListener(this); // DB
		btn5.addActionListener(this); // DB
		btn6.addActionListener(this); // DB
		txt1.addKeyListener(this);
		area1.setEditable(false);
		table.addMouseListener(this);

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		panel.add(selectScroll);

		// Frame
		add(panel); // 프레임에 panel추가

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// DB Connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //드라이브 파일을 메모리공간에 적재
		System.out.println("Driver Loading Success..");
		try {
			conn = DriverManager.getConnection(url,id,pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB Connected..");
		
		modifiedRowList = new ArrayList<Integer>();
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		scroll1.setVisible(true);
		
		// TODO Auto-generated method stub
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
//				System.out.println("txt1's Enter");
				String str = txt1.getText();
				area1.append(str + "\n");
				txt1.setText("");
			}

		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn3) {
			try {
				pstmt = conn.prepareStatement("INSERT INTO TBL_MEMO VALUES(null, ?, now())");
				pstmt.setString(1, area1.getText());
				int result = pstmt.executeUpdate();
				
				if (result > 0) {
					System.out.println("Insert 성공");
				} else {
					System.out.println("Insert 실패");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try { pstmt.close(); } catch (SQLException e1) { e1.printStackTrace(); }
			}
		} else if (e.getSource() == btn6) {
			scroll1.setVisible(false);
			
			
			
			try {
				// 테이블 구조 생성
				String[] column = {"NO", "MEMO", "DATE"};
				Object[][] data = {};
				DefaultTableModel model = new DefaultTableModel(data, column);
				
				pstmt = conn.prepareStatement("SELECT * FROM TBL_MEMO");
				rs = pstmt.executeQuery();
				
				if (rs != null) {
					while(rs.next()) {
						System.out.print(rs.getInt(1) + " ");
						System.out.print(rs.getString(2) + " ");
						System.out.print(rs.getDate(3));
						System.out.println();
						Object[] rowData = {rs.getInt(1), rs.getString(2), rs.getDate(3)};
						model.addRow(rowData);
					}
				}
				
				
				table.setModel(model);
				
				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				try { rs.close(); } catch (SQLException e1) { e1.printStackTrace(); }
				try { pstmt.close(); } catch (SQLException e1) { e1.printStackTrace(); }
			}
		}
		if (e.getSource() == btn4) {
			System.out.println("Update Clicked");
			TableModel model = table.getModel();
			
			try {
			
				try {
					conn.setAutoCommit(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				for (int row : modifiedRowList) {
					int no = (Integer)model.getValueAt(row, 0);
					String memo = (String)model.getValueAt(row, 1);
					pstmt = conn.prepareStatement("UPDATE TBL_MEMO SET MEMO = ?, DATE = NOW() WHERE ID = ?");
					pstmt.setString(1, memo);
					pstmt.setInt(2, no);
					
					int result = pstmt.executeUpdate();
					
					if (result > 0) System.out.println("Update 성공");
					else System.out.println("Update 실패");
					
				} 
				conn.commit();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try { pstmt.close(); } catch (SQLException e1) { e1.printStackTrace(); }
				modifiedRowList.clear();
			}
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == table) {
			TableModel model = table.getModel();
//			System.out.println("TABLE ClICKED");
//			System.out.println("row : " + table.getSelectedRow());
//			System.out.println("col : " + table.getSelectedColumn());
			
			int row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			
			Object value = model.getValueAt(row, col);
			
			System.out.println("Value: " + value);
			
			modifiedRowList.add(row);
			
		}
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class C07SWING_DB {
	public static void main(String[] args) {
		new GUI();
	}
}
