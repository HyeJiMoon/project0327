package homework3;




import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class SaveProgress extends JFrame implements ActionListener{
	JPanel panel;
	JProgressBar bar;
	JButton bt_open, bt_save ,bt_copy;
	JTextField t_open,t_save;
	JFileChooser chooser;
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	
	
	public SaveProgress() {
		panel=new JPanel();
		bar=new JProgressBar();
		
		bt_open=new JButton("열기");
		bt_save=new JButton("저장");
		bt_copy=new JButton("복사실행");
		
		t_open=new JTextField(30);
		t_save=new JTextField(30);
		
		setLayout(new FlowLayout());
		
		add(bar,BorderLayout.NORTH);
		bar.setPreferredSize(new Dimension(450, 40));
		add(bt_open);
		add(t_open);
		add(bt_save);
		add(t_save);
		add(bt_copy,BorderLayout.SOUTH);
		
		//bt 연결
	
		bt_open.addActionListener(this);
		bt_save.addActionListener(this);
		bt_copy.addActionListener(this);
		
		chooser=new JFileChooser("C:/java_workspace2/project0323");
		
		
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();
		
		if(obj==bt_open){
			open();
			
		}
		save();
		copy();
		
		
	}

	//파일열기
		public void open(){
		
			int state=chooser.showOpenDialog(this);
			if(state==JFileChooser.APPROVE_OPTION){
			
				file=chooser.getSelectedFile();
				
				String path=file.getAbsolutePath();		
				
				t_open.setText(path);
				
			}		
		}
		public void save(){
			String oripath=t_open.getText();
			String dest=t_save.getText();
			
			try {
				fis=new FileInputStream(oripath);
				fos=new FileOutputStream(dest);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		
		}
	public static void main(String[] args) {
		new SaveProgress();
	}

}
//쓰레드로 파일처리 ???
//파일 용량 file.length();
//286 : 100% = 5 : x%
