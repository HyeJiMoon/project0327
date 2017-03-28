package thread;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MoveOval extends JFrame{
	JButton bt;
	Canvas can;
	int x,y;
	MoveOval moveOval;
	
	public MoveOval(){
		bt=new JButton("¿Ãµø");
		can=new Canvas(){
			public void paint(Graphics g) {
				g.drawOval(x,y,50,50);
				g.drawOval(x,y+70, 70,70);
				g.drawOval(x,y+200, 100,100);
			
			}
			
		};
	
		add(bt,BorderLayout.NORTH);
		
		can.setBackground(Color.pink);
		add(can);
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void move(int x,){
		can.x+=5;
		can.repaint();
		
	}
	
	
	public static void main(String[] args) {
		new MoveOval();
	}

}
