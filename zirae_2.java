package week11;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//���� - �����ϱ�,��������, �����ϱ�
//���� - ���� �ҷ�����
//���� = ����


public class zirae_2 extends JFrame {

	zirae_2() {
		setLayout(new GridLayout(10, 20));
		
		JMenuBar mb=new JMenuBar();
		JMenu game = new JMenu("����");
		JMenu file = new JMenu("����");
		JMenu help = new JMenu("����");
		
		mb.add(game);
		mb.add(file);
		mb.add(help);
		
		JMenuItem item =new JMenuItem("�����ϱ�");
		JMenuItem item2 =new JMenuItem("��������");
		JMenuItem item3 =new JMenuItem("�����ϱ�");
		JMenuItem item4 =new JMenuItem("����");
		JMenuItem item5 =new JMenuItem("�ҷ�����");
		JMenuItem item6 =new JMenuItem("����");
		 
		game.add(item);
		game.add(item2);
		game.add(item3);
		file.add(item4);
		file.add(item5);
		help.add(item6);
		
		
		
		JButton j[] = new JButton[200];
		for (int i = 0; i < 200; i++) {
			j[i] = new JButton("");
			add(j[i]);
			int idx=i;
			j[i].addActionListener(e->{
				Color color=new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),(int)(Math.random()*255.0));
				j[idx].setBackground(color);
			});
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1000, 550);
		setVisible(true);
		this.setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zirae_2 zi = new zirae_2();

	}
}
