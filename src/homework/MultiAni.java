//���δٸ� �׷���, �ӵ�, ��Ÿ���� ���� ��ü�� �����̰� ����
//thread 3���� ����

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
		bt=new JButton("���� �����̱�");
		can=new Canvas(){
			//����Ʈ�޼��� ������
			@Override
			public void paint(Graphics g) {
				//gp=g; //������ �ٸ��� �ؼ� �ؿ� g�� �޾����� 
			}
			
		};
		
		//ct=new CircleThread(gp, 0, 0, 50, 50); //��� graphics g�� ���ܾ��ϴϱ� �ؿ� �־����� paint �ȿ��� new �ϸ� �ʹ� ���̻��� 
		//ct.start(); �̶��� ������ ������ ������������� ���� ���� ��ư�Ʒ��� ������!
		
		can.setBackground(Color.pink);
		
		add(bt,BorderLayout.NORTH);
		add(can);
		
		bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Graphics g=can.getGraphics(); //���������Ʈ�� �ڱ��ȷ�Ʈ�� �Ѱܹ޴� �޼��尡 �ִ� 
				
						
					CircleThread ct=new CircleThread(0,0,50,50,100,g); //��� graphics g�� ���ܾ��ϴϱ� �ؿ� �־����� paint �ȿ��� new �ϸ� �ʹ� ���̻��� 
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
