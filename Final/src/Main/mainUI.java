package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Action.BegginerDifficultyActionListener;
import Action.ExpertDifficultyActionListener;
import Action.HighScoreListener;
import Action.IntermediateDifficultyActionListener;
import Action.LoadGameActionListener;
import Action.NewGameActionListener;
import Action.SaveGameActionListener;
import Button.CustomButton;
import Timer.TimerThread;

public class mainUI {
	static JFrame fr = new JFrame("지뢰찾기");
	static JPanel content, status;
	static JLabel timer, score;
	static CustomButton grids[][] = new CustomButton[20][30];
	static int difficulty = 1;
	public static TimerThread timerThread;
	static int[][] mineArray = new int[20][30];
	static int a, b, mines;
	static int dx[] = { 0, 0, 1, -1, 1, 1, -1, -1 };
	static int dy[] = { 1, -1, 0, 0, 1, -1, 1, -1 };
	static int highscore = -1;

	public mainUI() {
		createMenu();
		setContent();
	}

	public void setContent() {
		// TODO Auto-generated method stub
		content = new JPanel(new GridLayout(10, 10));
		status = new JPanel(new GridLayout(0, 4));
		status.setPreferredSize(new Dimension(0, 30));
		score = new JLabel("0");
		timer = new JLabel("0");

		a = 10;
		b = 10;
		mines = 10;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grids[i][j] = new CustomButton(i, j);
				content.add(grids[i][j]);
			}
		}
		fr.add(content, BorderLayout.CENTER);

		makeMineArray();

		status.add(new JLabel("지뢰 ", JLabel.RIGHT));
		status.add(score);
		status.add(new JLabel("시간 ", JLabel.RIGHT));
		status.add(timer);
		fr.add(status, BorderLayout.NORTH);

		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.pack();

		timerThread = new TimerThread(timer);
	}

	public void createMenu() {
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();

		JMenu game = new JMenu("메뉴");
		JMenu dif = new JMenu("난이도");

		JMenuItem newG = new JMenuItem("새 게임");
		JMenuItem saveG = new JMenuItem("저장");
		JMenuItem loadG = new JMenuItem("불러오기");
		JMenuItem highscore = new JMenuItem("최고점");

		JMenuItem beginner = new JMenuItem("초급");
		JMenuItem intermediate = new JMenuItem("중급");
		JMenuItem expert = new JMenuItem("고급");

		newG.addActionListener(new NewGameActionListener());
		saveG.addActionListener(new SaveGameActionListener());
		loadG.addActionListener(new LoadGameActionListener());
		highscore.addActionListener(new HighScoreListener());

		beginner.addActionListener(new BegginerDifficultyActionListener());
		intermediate.addActionListener(new IntermediateDifficultyActionListener());
		expert.addActionListener(new ExpertDifficultyActionListener());

		game.add(newG);
		game.add(saveG);
		game.add(loadG);
		game.add(highscore);

		dif.add(beginner);
		dif.add(intermediate);
		dif.add(expert);

		mb.add(game);
		mb.add(dif);

		fr.setJMenuBar(mb);
	}

	public static JFrame getFrame() {
		return fr;
	}

	public static CustomButton[][] getGrids() {
		return grids;
	}

	public static void setGrids(CustomButton[][] g) {
		grids = g;
	}

	public static JLabel getScore() {
		return score;
	}

	public static void setScore(String str) {
		score.setText(str);
	}

	public static JLabel getTimer() {
		return timer;
	}

	public static void setTimer(String str) {
		timer.setText(str);
	}

	public static TimerThread getTimerThread() {
		return timerThread;
	}

	public static int getDifficulty() {
		return difficulty;
	}

	public static void Load(int d, CustomButton[][] grid, int[][] minearr, String tm) {
		fr.remove(content);
		switch (d) {
		case 1:
			content = new JPanel(new GridLayout(10, 10));
			a = 10;
			b = 10;
			mines = 10;
			mineArray = minearr;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					grids[i][j] = grid[i][j];
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;

		case 2:
			a = 10;
			b = 20;
			mines = 40;
			mineArray = minearr;
			content = new JPanel(new GridLayout(10, 20));
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					grids[i][j] = grid[i][j];
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;

		case 3:
			a = 20;
			b = 30;
			mines = 99;
			mineArray = minearr;
			content = new JPanel(new GridLayout(20, 30));
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 30; j++) {
					grids[i][j] = grid[i][j];
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;
		}
		fr.pack();
		setTimer(tm);
	}

	public static void setDifficulty(int d) {
		fr.remove(content);
		switch (d) {
		case 1:
			content = new JPanel(new GridLayout(10, 10));
			a = 10;
			b = 10;
			mines = 10;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					grids[i][j] = new CustomButton(i, j);
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;

		case 2:
			a = 10;
			b = 20;
			mines = 40;
			content = new JPanel(new GridLayout(10, 20));
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					grids[i][j] = new CustomButton(i, j);
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;

		case 3:
			a = 20;
			b = 30;
			mines = 99;
			content = new JPanel(new GridLayout(20, 30));
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 30; j++) {
					grids[i][j] = new CustomButton(i, j);
					content.add(grids[i][j]);
				}
			}
			difficulty = d;
			fr.add(content, BorderLayout.CENTER);
			break;
		}
		makeMineArray();
		fr.pack();
	}

	public static int[][] getMineArray() {
		return mineArray;
	}

	public static void setMineArray(int[][] m) {
		mineArray = m;
	}

	public static void makeMineArray() {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);

		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 30; j++) {
				mineArray[i][j] = 0;
			}

		int tmp = mines;
		while (tmp > 0) {
			int ra = rand.nextInt(a);
			int rb = rand.nextInt(b);

			if (mineArray[ra][rb] == 0) {
				mineArray[ra][rb] = 9;
				tmp--;
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < 8; k++) {
					int nextI = i + dy[k];
					int nextJ = j + dx[k];
					if (nextI >= 0 && nextI < a && nextJ >= 0 && nextJ < b && mineArray[i][j] != 9) {
						if (mineArray[nextI][nextJ] == 9)
							mineArray[i][j]++;
					}
				}
			}
		}
		score.setText("" + mines);
	}

	public static void gameStep(int idx_i, int idx_j) {
		int val = mineArray[idx_i][idx_j];
		if (endGame()) {
			if (highscore == -1)
				setHighscore(timerThread.getTime());
			else if (highscore > timerThread.getTime())
				setHighscore(timerThread.getTime());

			getTimerThread().activate = false;
			getTimerThread().gameover = true;
			String tm = "걸린 시간: " + timerThread.getTime();
			JOptionPane.showMessageDialog(null, "이겼슴돠!\n" + tm);
		}
		if (val == 0) {
			DFS(idx_i, idx_j);
		} else if (val == 9) {
			getTimerThread().activate = false;
			getTimerThread().gameover = true;

			// game over
			JOptionPane.showMessageDialog(null, "지뢰를 밟았다!");

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					grids[i][j].removeMouseListener(grids[i][j].getMouseListeners()[1]);
					if (mineArray[i][j] == 9) {
						grids[i][j].setStatus(3);
					}
				}
			}

			int result = JOptionPane.showConfirmDialog(null, "새로운 게임을 하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				setDifficulty(getDifficulty());
				setTimer("0");
				getTimerThread().activate = false;
				getTimerThread().gameover = false;
			} else {

			}

		} else {
			grids[idx_i][idx_j].setStatus(2);
			grids[idx_i][idx_j].setText("" + mineArray[idx_i][idx_j]);
		}
	}

	public static void setHighscore(int time) {
		// TODO Auto-generated method stub
		highscore = time;
		try {
			File hscore = new File("hscore.txt");
			BufferedWriter op = new BufferedWriter(new FileWriter(hscore));

			// write the highest score to the file
			op.write(Integer.toString(time));
			op.flush();
			op.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int getHighscore() {
		try {
			File hscore = new File("hscore.txt");

			if (!hscore.exists()) {
				highscore = -1;
			} else {
				BufferedReader ip = new BufferedReader(new FileReader(hscore));
				String txt = ip.readLine();

				highscore = Integer.parseInt(txt);
				ip.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return highscore;
	}

	private static boolean endGame() {
		// TODO Auto-generated method stub
		boolean flag = true;
		int j = 0;
		for (int i = 0; i < a; i++) {
			j = 0;
			if (!flag)
				break;
			while (j != b) {
				if (grids[i][j].getStatus() != 0)
					flag = true;
				else {
					flag = false;
					break;
				}
				j++;
			}
		}
		return flag;
	}

	public static void DFS(int idx_i, int idx_j) {
		// TODO Auto-generated method stub
		if (idx_i >= 0 && idx_i < a && idx_j >= 0 && idx_j < b) {
			if (grids[idx_i][idx_j].visit == false) {
				grids[idx_i][idx_j].visit = true;
				grids[idx_i][idx_j].setStatus(4);
				grids[idx_i][idx_j].setText("" + mineArray[idx_i][idx_j]);
				if (mineArray[idx_i][idx_j] == 0) {
					for (int i = 0; i < 4; i++)
						DFS(idx_i + dy[i], idx_j + dx[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainUI();
		timerThread.run();
	}

}
