package progressbar;

import javax.swing.JProgressBar;

public class ProgressBarThread extends Thread{
	JProgressBar bar;
	int interval;
	int count;
	
	public ProgressBarThread(JProgressBar bar,int interval) {
		this.bar=bar;
		this.interval=interval;
		
		start();
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
		
}
