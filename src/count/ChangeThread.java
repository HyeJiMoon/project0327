package count;

import javax.swing.JLabel;

public class ChangeThread extends Thread{
	JLabel left_la;
	
	public ChangeThread() {
		
		
	}
	
	public void run() {
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
