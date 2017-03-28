package thread;

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
	AniMain aniMain;
	
	
	public AniMain() {
		aniMain=this;
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
				//동생 만들어서 일시키자 !! //기존 AniMain 의 레퍼런스= 그냥 aniMain도 먹히고 클래스명.this 도 가능 aniMain.this 도 가능
				MoveThread  mt=new MoveThread(AniMain.this);
				mt.start();
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
