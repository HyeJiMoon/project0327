//서로다른 그래픽, 속도, 기타값을 갖는 물체를 움직이게 하자
//thread 3개로 가자

package homework;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiAni extends JFrame{
	JButton bt;
	Canvas can;
	Graphics gp;
	CircleThread ct;
	
	public MultiAni(){
		bt=new JButton("각자 움직이기");
		can=new Canvas(){
			//페인트메서드 재정의
			@Override
			public void paint(Graphics g) {
				//gp=g; //변수명 다르게 해서 밑에 g가 받아지게 
			}
			
		};
		
		//ct=new CircleThread(gp, 0, 0, 50, 50); //적어도 graphics g가 생겨야하니까 밑에 넣어주자 paint 안에서 new 하면 너무 많이생겨 
		//ct.start(); 이때의 시점은 보더가 만들어지기전에 원을 만들어서 버튼아래로 내리자!
		
		can.setBackground(Color.pink);
		
		add(bt,BorderLayout.NORTH);
		add(can);
		
		bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Graphics g=can.getGraphics(); //모든컴포넌트는 자기팔레트를 넘겨받는 메서드가 있다 
				
						
					CircleThread ct=new CircleThread(0,0,50,50,100,g); //적어도 graphics g가 생겨야하니까 밑에 넣어주자 paint 안에서 new 하면 너무 많이생겨 
					RectThread rt=new RectThread(0,200,100,100,10,g);
				
				//ct.start();
				//ShapeThread st=ct;
				//st.start();
				
			}
		});
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		
	}
	
	public static void main(String[] args) {
		new MultiAni();
	}

}
