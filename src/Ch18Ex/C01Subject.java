package Ch18Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class ChatServer extends JFrame implements KeyListener, ActionListener {
	private JButton saveBtn = new JButton("파일로저장");
	private JButton reqBtn = new JButton("1:1요청");
	private JButton recordViewBtn = new JButton("대화기록보기");
	private JButton insertBtn = new JButton("입력");
	
	private JTextField txt1 = new JTextField();
	
	private JTextArea area1 = new JTextArea();
	
	private JScrollPane scroll1;
	
	public ChatServer() {
		// Frame 생성, 채팅 프로그램 Title 설정
		super("Chatting Server");
		
		
		// 채팅 프로그램 Layout 설정
		setBounds(100, 100, 350, 320);
		// 창 종료시 프로그램 종료 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel 생성
		JPanel panel = new JPanel();
		// Panel default layout 삭제
		panel.setLayout(null);;
		
		// scroll 설정
		scroll1 = new JScrollPane(area1);
		
		// Btn Layout 설정
		saveBtn.setBounds(220, 20, 100, 30);
		reqBtn.setBounds(220, 65, 100, 30);
		recordViewBtn.setBounds(220, 110, 100, 30);
		insertBtn.setBounds(220, 235, 100, 30);
		
		// Scroll(TextArea) Layout 설정
		scroll1.setBounds(15, 20, 185, 200);
		// TextField Layout 설정
		txt1.setBounds(15, 235, 185, 30);
		
		// TextArea 직접 편집 disable
		area1.setEditable(false);
		
		// Event 추가
		txt1.addKeyListener(this);
		saveBtn.addActionListener(this);
		reqBtn.addActionListener(this);
		recordViewBtn.addActionListener(this);
		insertBtn.addActionListener(this);
		
		// Panel 에 btn 추가
		panel.add(saveBtn);
		panel.add(reqBtn);
		panel.add(recordViewBtn);
		panel.add(insertBtn);
		
		// Panel 에 scroll(textArea) 추가
		panel.add(scroll1);
		// Panel 에 textField 추가
		panel.add(txt1);
		
		// Frame 에  Panel 추가
		add(panel);
		
		// size 조절 disable
		super.setResizable(false);
		// Frame visible
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == txt1) {  					// textField에 이벤트가 발생했을 때
			if (e.getKeyCode() == 10) {					// keyCode 10, 엔터가 입력된다면
				area1.append(txt1.getText() + "\n");	// textArea 에 내용 추가
				txt1.setText("");						// textField 내용 초기화
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
		
		// 파일 경로 설정
		String dirPath = System.getProperty("user.dir");
		String packageName = C01Subject.class.getPackageName();
		String filePath = dirPath + File.separator + "src" + File.separator + packageName + File.separator + "chatRecord.txt";
		
		if (e.getSource() == saveBtn) {
			System.out.println("파일로저장 실행");
			String chat = area1.getText();
			
			System.out.println(filePath);
			
			try {
				FileWriter fw = new FileWriter(filePath);
				fw.write(chat);
				
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (e.getSource() == reqBtn) {
			System.out.println("1:1 요청 실행");
		} else if (e.getSource() == recordViewBtn) {
			System.out.println("대화기록보기 실행");
			try {
				File file = new File(filePath);
				FileReader fr = new FileReader(file);
				BufferedReader bufReader = new BufferedReader(fr);
				String line = "";
				
				if (area1.getText().length() > 0) {
					area1.append("\n");
				}
				
				while( (line = bufReader.readLine()) != null ) {
					area1.append(line + "\n");
				}
				bufReader.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e2) { 
				e2.printStackTrace();
			}
		} else if (e.getSource() == insertBtn) {
			System.out.println("입력 실행");
			
			if (txt1.getText().length() > 0) {
				area1.append(txt1.getText() + "\n");
				txt1.setText("");
			}
		}
	}
}

public class C01Subject {
	public static void main(String[] args) {
		new ChatServer();
	}
}
