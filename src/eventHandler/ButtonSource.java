package eventHandler;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonSource extends JFrame {
	ButtonSource() {
		setTitle("Swing Practice");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton button1 = new JButton("Play");
		button1.addActionListener(new MyActionListener());
		add(button1);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			JButton button = (JButton)ev.getSource();
			if (button.getText().equals("Play")); {
				button.setText("Stop");
			}
			button.setText("Play");
		}
	}
	public static void main(String[] args) {
		ButtonSource frame = new ButtonSource();
	}
}
