//개발자가 쓰레드를 상속하여 개발할 수 있으나 이미 다른 클래스의 자식일 경우, 상속은 불가하다. 
//이럴 때 사용할 수 있는 객체가 바로 runnable인터페이스이다
package thread3;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AniMain extends JFrame implements Runnable{
	
	JButton bt;
	Canvas can;
	int x,y;
	Thread thread; 
	
	public AniMain() {
		//runnable인 객체를 인수로 넘긴다
		//그러면, run 메서드의 호출은 runnable 을 재정의한 객체의 run 을 호출한다
		thread=new Thread(this);
		
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

	public void run(){
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			move();
			
		}
		
		
		
	}
	public static void main(String[] args) {
		new AniMain();
	}

	
}
