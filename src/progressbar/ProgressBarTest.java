package progressbar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarTest extends JFrame{
	JProgressBar[] bar=new JProgressBar[3];
	MyBar[] mb=new MyBar[3];
	int[] interval = {100,500,300};
	JButton bt;
	int count;
	
	
	public ProgressBarTest() {
		setLayout(new FlowLayout());
		for(int i=0;i<bar.length;i++){
			bar[i] =new JProgressBar();
			mb[i] =new MyBar(bar[i], interval[i]);
			bar[i].setPreferredSize(new Dimension(450, 40));
			add(bar[i]);
		}
		bt=new JButton("�۵�");
		
		add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//count++;
				

				//bar.setValue(count);
			
			}
		});
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ProgressBarTest();
	}

}
