package week11;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDemo extends JFrame {
	ImageDemo() {
		setTitle("ดÞทย");

		class MyPanel extends JPanel {
			BufferedImage[] img = new BufferedImage[12];
			String[] mon = { "JAN.png", "FEB.png", "MAR.png", "APR.png", "MAY.png", "JUN.png", "JUL.png", "AUG.png",
					"SEP.png", "OCT.png", "NOV.png", "DEC.png" };
			String Path = "Calendar/";

			public MyPanel() {
				try {
					for (int i = 0; i < 12; i++)
						img[i] = ImageIO.read(new File(Path + mon[i]));
				} catch (IOException e) {
				}
			}

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int height=img[0].getHeight();
				int width=img[0].getWidth()+5;
				
				for(int i=0;i<6;i++)
					g.drawImage(img[i],0+(width*i), 0, null);
				for(int j=6;j<12;j++)
					g.drawImage(img[j],0+(width*(j-6)),height+5,null);
			}
		}
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1260, 450);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageDemo();
	}
}
