package Ch18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

@SuppressWarnings("serial")
class C05GUI extends JFrame implements ActionListener, KeyListener, MouseListener {
	// Btn_component 추가
	// 버튼에 따른 이벤트 데어를 하려면 해당 요소를 멤버변수로 선언한다
	private JButton btn1 = new JButton("Button01");
	private JButton btn2 = new JButton("Button02");
	
	// TextField_component 추가
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	
	// TextArea_component 추가
	private JTextArea area1 = new JTextArea();
	
	// ScrollPanel_component 추가
	JScrollPane scroll1;
	
	public C05GUI() {
		super("세번째 프레임입니다.");		
		
		setBounds(100, 100, 250, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel 생성
		JPanel panel = new JPanel();	
		panel.setLayout(null);
		
		Color col = new Color(100, 100, 100);
		panel.setBackground(col);
		
		
		// Button Layout 지정
		btn1.setBounds(10, 10, 100, 30);		
		btn2.setBounds(120, 10, 100, 30);
		
		// TextField Layout 지정
		txt1.setBounds(10, 50, 210, 30);
		txt2.setBounds(10, 90, 210, 30);
		
		// TextArea Layout 지정
		area1.setBounds(10, 130, 210, 200);
		
		// ScrollPanel Layout 지정
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 130, 210, 200);
		
		// panel 에 어떤 위치에 추가하여도 중간에 온다
		// panel 의 기본 레이아웃을 없애야 한다
		// panel.setLayout(null); 을 추가 해야한다
		
		// Event 에 component 추가
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		txt2.addKeyListener(this);
		area1.addKeyListener(this);
		area1.addMouseListener(this);
		
		// Component 를 Panel 에 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		
		// Frame 에 panel 을 추가
		add(panel);
		
		
		super.setResizable(false);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 눌렀을 때 / 땟을 때 (UNICODE 문자)
		// 제어 문자에 대한 처리가 불가능하다
		// KeyCode가 출력되지 않는다
//		 System.out.println("KeyTyped... " + e.getKeyChar());
//		 System.out.println("KeyTyped... " + e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 눌렀을 때
		// 한글은 인식하지 않는다
//		System.out.println("keyPressed... " + e.getKeyChar());
//		System.out.println("keyPressed... " + e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				// txt1에 있는 문자열을 area1에 덧붙이기
				// txt1의 값을 초기화 해줘야한다
				String msg = txt1.getText();
				area1.append(msg + "\n");
				txt1.setText("");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키를 땟을 때 (UNICODE 미지원)
		// 한글을 쳐도 영문으로 인식한다
//		System.out.println("keyReleased... " + e.getKeyChar());
//		System.out.println("keyReleased... " + e.getKeyCode());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			System.out.println("btn1 !!!!!");
		} else if (e.getSource() == btn2) {
			System.out.println("btn2 !!!!!");
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Clicked! " + e.getPoint());
			int offset = area1.viewToModel(e.getPoint());
			System.out.println(offset);
			int row;
			
			row = area1.getLineOfOffset(offset);
			
			System.out.println("row : " + row);  // 0번 부터
			
			int startOffset = area1.getLineStartOffset(row);
			int endOffset = area1.getLineEndOffset(row);
			String getText = area1.getText(startOffset, endOffset - startOffset);
			System.out.println("msg: " + getText);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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

public class C05SwingMain {
	public static void main(String[] args) {
		new C05GUI();
	}
}
