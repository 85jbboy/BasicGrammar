package eventHandler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseSource extends JFrame {
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel();
	
	MouseSource() {
		setTitle("마우스 좌표 출력");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1.add(label1);
		panel1.addMouseMotionListener(new MyMouseMotion());
		add(panel1);
	}
	
	class MyMouseMotion implements MouseMotionListener {
		public void mouseDragged(MouseEvent ev) {}
		public void mouseMoved(MouseEvent ev) {
			Integer x = ev.getX();
			Integer y = ev.getY();
			String str = "X: "+x.toString() + " Y: " +y.toString();
			label1.setText(str);
		}
	}
	public static void main(String[] args) {
		MouseSource ms = new MouseSource();
	}
}
