package homework2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountApp extends JFrame{
	JLabel la1,la2;
	
	public CountApp() {
		la1=new JLabel("0");
		la2=new JLabel("1");
		
		setLayout(new FlowLayout());
		
		//알아보기위해 잠시 색상주자
		la1.setBackground(Color.PINK);
		la2.setBackground(Color.YELLOW);
		
		//컴포넌트 크기를 억지로 키워보자
		la1.setPreferredSize(new Dimension(300, 380));
		la2.setPreferredSize(new Dimension(300, 380));
		
		la1.setFont(new Font("Dotum", Font.BOLD, 75));
		la2.setFont(new Font("Dotum", Font.BOLD, 75));
		
		add(la1);
		add(la2);
		
		setVisible(true);
		setSize(700,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Thread 두개 생성하자 
		CountThread ct1=new CountThread(la1, 1000);
		CountThread ct2=new CountThread(la2, 500);
		
	}
	
	public static void main(String[] args) {
		new CountApp();
	}

}
