package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Main.mainUI;

public class HighScoreListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int score = mainUI.getHighscore();
		if(score == -1) {
			JOptionPane.showMessageDialog( null, " 최고 기록이 없습니다.! ", "The Best Time", JOptionPane.INFORMATION_MESSAGE );
		}
		else{
			JOptionPane.showMessageDialog( null, " 최고기록 : "+score, "The Best Time", JOptionPane.INFORMATION_MESSAGE );
		}
	}

}
