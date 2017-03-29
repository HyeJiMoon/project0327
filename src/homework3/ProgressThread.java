package homework3;

import javax.swing.JFileChooser;
import javax.swing.JProgressBar;

public class ProgressThread extends Thread{
	JProgressBar bar;
	JFileChooser chooser;
	
	
	public ProgressThread(){
		this.bar=bar;
		
		
	}
	
	public void run() {
		while(true){
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			e.printStackTrace();
			}
		}
	}
}

	


