package Ch18;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame {
	public C03GUI() {
		super("세번째 프레임입니다.");		
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel 생성
		JPanel panel = new JPanel();
		
		
		Color col = new Color(100, 100, 100);
		panel.setBackground(col);
		
		// Frame에 panel을 추가
		add(panel);
		
		setVisible(true);
	}
}

public class C03SwingMain {
	public static void main(String[] args) {
		new C03GUI();
	}
}
