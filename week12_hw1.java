package week12;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class game extends JFrame implements ActionListener {
	JMenuBar mb;
	JButton j[];
	JMenuItem item;
	JMenuItem item2;
	JMenuItem item3;
	Random rand = new Random();

	game() {
		setLayout(new GridLayout(6, 6));
		createmenu();
		gameSet();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
	}

	public void gameSet() {
		j = new JButton[36];
		for (int i = 0; i < 36; i++) {
			int rn = rand.nextInt(36) + 1;
			j[i] = new JButton("" + rn);
			add(j[i]);
		}

	}

	public void createmenu() {

		mb = new JMenuBar();
		JMenu game = new JMenu("게임");
		JMenu file = new JMenu("파일");

		mb.add(game);
		mb.add(file);

		item = new JMenuItem("새게임");
		item.addActionListener(this);

		item2 = new JMenuItem("저장");
		item2.addActionListener(this);

		item3 = new JMenuItem("불러오기");
		item3.addActionListener(this);

		game.add(item);
		file.add(item2);
		file.add(item3);

		setJMenuBar(mb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		File file = new File("C:\\Users\\yun\\Desktop\\game.txt");
		
		if(obj==item) {
			for (int i = 0; i < 36; i++) {
				int rn = rand.nextInt(36) + 1;
				j[i].setText(""+rn);
			}
		}
		else if(obj==item2) {
			try {
				FileWriter fw = new FileWriter(file);
				for(int i=0;i<36;i++) {
					fw.write(j[i].getText()+"\n");
				}
				fw.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		else {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader bf = new BufferedReader(fr);
				String line ="";
				int idx=0;
				while((line=bf.readLine())!=null) {
					j[idx].setText(""+line);
					idx++;
				}
				bf.close();
			}catch(FileNotFoundException e2) {
				
			}catch(IOException e3) {
				
			}
		}
	}

}

public class week12_hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new game();

	}
}
