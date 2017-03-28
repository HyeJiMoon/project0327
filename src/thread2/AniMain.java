//thread2 에서 animain 자체에 내부익명 만들어줘서 .java만들지 말아보자 thread 의 aniMain과MoveThread 비교해서 공부 
package thread2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AniMain extends JFrame{
	
	JButton bt;
	Canvas can;
	int x,y;
	Thread thread; //내부익명스타일로 개발
	
	public AniMain() {
		thread=new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					move();
					
				}
			}		
		};
		bt=new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		
		can=new Canvas(){ //내부익명 - > 멤버변수 받으려고 
			public void paint(Graphics g){
				g.drawOval(x, y, 50, 50);
				
			}
		
		};
		
		can.setBackground(Color.YELLOW);
		add(can);
		
		//버튼과 리스너 연결
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//이동하는 메서드호출 ! 
				thread.start();
			}
		});
		//개발자는독립된 코드를  run ! thread
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void move(){
		x+=5;
		can.repaint();
		
	}

	
	public static void main(String[] args) {
		new AniMain();
	}

}
