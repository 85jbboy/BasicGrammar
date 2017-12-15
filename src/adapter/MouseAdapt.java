package adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseAdapt extends JFrame {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	MouseAdapt() {
		setTitle("마우스 좌표 출력");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel.setLayout(null);
		label.setLocation(20, 20);
		label.setText("클릭 좌표");
		
		panel.add(label);
		panel.addMouseListener(new MyMouse());
		
		add(panel);
	}
	class MyMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			Integer x = e.getX();
			Integer y = e.getY();
			String string = "클릭 좌표: " +x.toString()  + ", " +y.toString();
			label.setText(string);
		}
	}
	public static void main(String[] args) {
		MouseAdapt adap = new MouseAdapt();
	}
		
	}
