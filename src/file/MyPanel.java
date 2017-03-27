//패널이 라벨과버튼을 가지고 있다 
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

	//생성자 -> 패널이 태어날 때 그 부품도 같이 태어나야하므로, 생성자에서 초기화 하자!
	public MyPanel(String title,Icon icon) { //생성자의매개변수 넘겨 받을 수 있으니까(그때그때 달라질수 있으니까)
		la=new JLabel(title);
		bt=new JButton(icon);
		
		
		bt.setBorderPainted(false);//버튼의 경계선없애기
		bt.setContentAreaFilled(false);//컨텐츠영역의 색칠해진거 없애기
		bt.setFocusPainted(false);//focus 에 의한 경계없애기 눌렀을 때 경계지는거 없애기
		bt.setOpaque(false);//투명으로하게 
		
		this.setLayout(new BorderLayout());
		add(la,BorderLayout.NORTH);
		add(bt);
		
	}
	
}
