package file;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FileExplorer extends JFrame{
	JButton bt_git, bt_settings,bt_res,bt_src,bt_bin;
	JPanel p_north;
	File file;
	ImageIcon icon;
	
	
	
	
	public FileExplorer(){
		p_north=new JPanel();
		icon=new ImageIcon("C:/java_workspace2/project0327/res/folder_on.png");
		bt_git=new JButton(icon);
		bt_settings=new JButton(icon);
		bt_res=new JButton(icon);
		bt_src=new JButton(icon);
		bt_bin=new JButton(icon);
	
		p_north.add(bt_git);
		p_north.add(bt_settings);
		p_north.add(bt_res);
		p_north.add(bt_src);
		p_north.add(bt_bin);
		
		
		add(p_north, BorderLayout.NORTH);
		setLayout(new FlowLayout());
		
		bt_git.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new FileExplorer();
		
	}

}
