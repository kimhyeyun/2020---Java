package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import Button.CustomButton;
import Main.mainUI;

public class SaveGameActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		if (mainUI.getTimerThread().gameover) {
			JOptionPane.showMessageDialog(null, "게임이 종료되어서 저장이 불가함!");
		}
		// TODO Auto-generated method stub
		// 점수, 시간, jbutton 상황
		else {
			mainUI.timerThread.activate = false;
			mainUI.timerThread.gameover = true;
			String str_mine = "mine: "+mainUI.getScore().getText();
			String str_time = "time: "+mainUI.timerThread.getTime();
			JOptionPane.showMessageDialog(null, "게임을 저장합니다!\n"+str_mine+"\n"+str_time);
			
			File saveFile = new File("game.txt");
			FileOutputStream ins = null;
			BufferedOutputStream buf = null;
			ObjectOutputStream obj = null;

			CustomButton[][] grid = mainUI.getGrids();
			int a = 0, b = 0;

			try {
				ins = new FileOutputStream(saveFile);
				buf = new BufferedOutputStream(ins);
				obj = new ObjectOutputStream(buf);

				switch (mainUI.getDifficulty()) {
				case 1:
					a = 10;
					b = 10;
					break;
				case 2:
					a = 10;
					b = 20;
					break;
				case 3:
					a = 20;
					b = 30;
					break;
				}

				obj.writeObject(mainUI.getDifficulty());
				obj.writeObject(mainUI.getScore().getText());
				obj.writeObject(mainUI.timerThread.getTime());
				obj.writeObject(mainUI.getGrids());
				obj.writeObject(mainUI.getMineArray());

				int st[][] = new int[a][b];

				for (int i = 0; i < a; i++) {
					for (int j = 0; j < b; j++) {
						if (grid[i][j] == null)
							break;
						st[i][j] = grid[i][j].getStatus();
					}
				}

				obj.writeObject(st);

				buf.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
