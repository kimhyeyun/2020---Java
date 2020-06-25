package Timer;

import javax.swing.JLabel;

public class TimerThread implements Runnable{

	JLabel timerLabel;
	public boolean activate = false;
	public boolean gameover = false;		
	int time;
	public TimerThread(JLabel j) {
		timerLabel = j;
	}
	
	public void setTime(int tm) {
		time = tm;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				timerLabel.setText(""+(time));
				Thread.sleep(1000);
				if(activate)
					time++;
				else if(!gameover)
					time=0;
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
