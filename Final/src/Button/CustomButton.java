package Button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Main.mainUI;

public class CustomButton extends JButton{
	int	status = 0;
	int i,j;
	public boolean  visit = false;
	
	public CustomButton(int i, int j) {
		this.i = i;
		this.j = j;
		this.setPreferredSize(new Dimension(45,45));
		setMouseAdapter();
	}
	
	public void setMouseAdapter() {
		// TODO Auto-generated method stub
		this.addMouseListener(new MouseAdapter() {
			boolean pressed;
			
			public void mousePressed(MouseEvent e) {
				pressed = true;
			}
			
			public void mouseReleased(MouseEvent e) {
				if(pressed) {
					//System.out.println("pressed");
					mainUI.getTimerThread().activate = true;
					if(getStatus() == 0 &&
							SwingUtilities.isRightMouseButton(e) &&
							getText().equals("")) {
						setStatus(1);
						mainUI.setScore(""+(Integer.parseInt(mainUI.getScore().getText())-1));
					}
					else if(getStatus() == 1 &&
							SwingUtilities.isRightMouseButton(e) &&
							getText().equals("")) {
						setStatus(0);
						mainUI.setScore(""+(Integer.parseInt(mainUI.getScore().getText())+1));
					}
					else if(getStatus() == 2)
						;
					else {
						if(getStatus() == 1) {
							mainUI.setScore(""+(Integer.parseInt(mainUI.getScore().getText())+1));
							setStatus(2);
							mainUI.gameStep(getI(), getJ());
						}
						setStatus(2);
						mainUI.gameStep(getI(), getJ());
					}
				}
			}
		});
	}

	protected int getJ() {
		// TODO Auto-generated method stub
		return this.j;
	}

	protected int getI() {
		// TODO Auto-generated method stub
		return this.i;
	}

	public void setStatus(int k) {
		// TODO Auto-generated method stub
		this.status = k;
		
		if(k == 0)//not clicked
			setColor(null);
		if(k == 1) {
			setColor(Color.BLUE);
		}
		if(k == 2)
			setColor(null);
		if(k == 3)
			setColor(Color.RED);
		if(k == 4)
			setColor(null);
	}

	
	private void setColor(Color color) {
		// TODO Auto-generated method stub
		this.setBackground(color);
	}

	public int getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

}
