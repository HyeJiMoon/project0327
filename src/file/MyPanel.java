//�г��� �󺧰���ư�� ������ �ִ� 
//JPanel has a Label&JButton
package file;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	JLabel la;
	JButton bt;

	//������ -> �г��� �¾ �� �� ��ǰ�� ���� �¾���ϹǷ�, �����ڿ��� �ʱ�ȭ ����!
	public MyPanel(String title,Icon icon) { //�������ǸŰ����� �Ѱ� ���� �� �����ϱ�(�׶��׶� �޶����� �����ϱ�)
		la=new JLabel(title);
		bt=new JButton(icon);
		
		
		bt.setBorderPainted(false);//��ư�� ��輱���ֱ�
		bt.setContentAreaFilled(false);//������������ ��ĥ������ ���ֱ�
		bt.setFocusPainted(false);//focus �� ���� �����ֱ� ������ �� ������°� ���ֱ�
		bt.setOpaque(false);//���������ϰ� 
		
		this.setLayout(new BorderLayout());
		add(la,BorderLayout.NORTH);
		add(bt);
		
	}
	
}
