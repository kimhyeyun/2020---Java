package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Button.CustomButton;
import Main.mainUI;

public class LoadGameActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		File loadFile = new File("game.txt");
		FileInputStream in = null;
		BufferedInputStream bf = null;
		ObjectInputStream obj = null;

		int dif, a = 0, b = 0;
		CustomButton grids[][] = mainUI.getGrids();

		try {
			in = new FileInputStream(loadFile);
			bf = new BufferedInputStream(in);
			obj = new ObjectInputStream(bf);

			dif = (Integer) (obj.readObject());

			switch (dif) {
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

			String sc = (String) (obj.readObject());
			int tm = (Integer) (obj.readObject());
			CustomButton[][] grid = (CustomButton[][]) (obj.readObject());
			int[][] mine = (int[][]) (obj.readObject());
			int[][] st =  (int[][]) (obj.readObject());

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (0 <= st[i][j] && st[i][j] <= 2) {
						grid[i][j].setStatus(st[i][j]);
						grid[i][j].setMouseAdapter();
					}
				}
			}
			
			JOptionPane.showMessageDialog(null, "저장된 게임을 불러옵니다!");
			//mainUI.setMineArray(mine);
			mainUI.Load(dif, grid, mine, Integer.toString(tm));
			mainUI.setScore(sc);
			mainUI.timerThread.setTime(tm);
			mainUI.timerThread.activate=true;
			mainUI.timerThread.gameover=false;
			
		} catch (IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
