package count;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountApp extends JFrame{
	JLabel left_la,right_la;

	
	public CountApp() {
		left_la=new JLabel("�ٲ�°�");
		right_la=new JLabel("�ٸ��Թٲ�°�");
		
		setLayout(new FlowLayout());
		add(left_la);
		add(right_la);
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new CountApp();
	}

}
