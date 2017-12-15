package gui_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CompConnect extends JFrame {
	
	CompConnect() {
		setTitle("Swing 연습");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		1) 컨텍트 팬을 통해 버튼을 추가하는 코드
//		Container contentPane = getContentPane();
//		contentPane.setLayout(null);
//		JButton button = new JButton("Test");
//		button.setSize(70, 20);
//		button.setLocation(50, 10);
//		contentPane.add(button);
		
//		2) JFrame을 통해 버튼을 추가하는 코드(코드는 간결하나 내부적으로는 ContentPane 동작함)
		this.setLayout(null); // 크기와 위치를 내가 직접 지정하겠다는 의미.
		JButton button = new JButton("test");
		button.setSize(70, 20);
		button.setLocation(50, 10);
		this.add(button);	
	}
	
	public static void main(String[] args) {
		CompConnect frame = new CompConnect();
	}
	
	

}
