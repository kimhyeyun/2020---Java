package week10;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class zirae extends JFrame {

	zirae() {
		setLayout(new GridLayout(10, 20));
		JButton j[] = new JButton[200];
		for (int i = 0; i < 200; i++) {
			j[i] = new JButton("");
			
			j[i].addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			add(j[i]);
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1000, 550);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zirae zi = new zirae();

	}
}
