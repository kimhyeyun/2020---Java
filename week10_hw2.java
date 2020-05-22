package week10;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class OddEvenCounter extends JFrame {
	CardLayout layout;
	JButton j = new JButton();

	public void count(int iter) {
		if (iter % 2 == 0)
			j.setText("¦");
		else
			j.setText("Ȧ");
	}

	OddEvenCounter() {
		setTitle("Ȧ¦ ī��Ʈ");
		layout = new CardLayout();
		setLayout(layout);
		add(j);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setVisible(true);
	}
}

public class week10_hw2 {
	public static void main(String[] args) {
		new OddEvenCounter().count(44);
	}
}