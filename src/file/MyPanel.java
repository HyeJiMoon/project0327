//�г��� �󺧰���ư�� ������ �ִ� 
//JPanel has a Label&JButton
package file;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener{
	JLabel la;
	JButton bt;
	//ArrayList<JButton> list=new ArrayList<JButton>(); //��ü�� �ڷ�����!!
	

	//������ -> �г��� �¾ �� �� ��ǰ�� ���� �¾���ϹǷ�, �����ڿ��� �ʱ�ȭ ����!
	public MyPanel(String title,Icon icon) { //�������ǸŰ����� �Ѱ� ���� �� �����ϱ�(�׶��׶� �޶����� �����ϱ�)
		la=new JLabel(title);
		bt=new JButton(icon);
		
	
		
		bt.setBorderPainted(false);//��ư�� ��輱���ֱ�
		bt.setContentAreaFilled(false);//������������ ��ĥ������ ���ֱ�
		bt.setFocusPainted(false);//focus �� ���� �����ֱ� ������ �� ������°� ���ֱ�
		bt.setOpaque(false);//���������ϰ� 
		
		
		list.add(bt);
	

		bt.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<list.size();i++){
					if(==){//Ŭ�� �������� ��������
						
						
					}else(){//Ŭ���ƴ� ������ �͵��� folder_off
						
						
					}
					
					
				}
			}
	
		});
		
		
		
		this.setLayout(new BorderLayout());
		add(la,BorderLayout.NORTH);
		add(bt);
		
	}
	



	
}
