package io;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoEditor extends JFrame{
	JPanel p_north;
	JButton bt_open, bt_save;
	JTextArea area;
	JScrollPane scroll;
	
	ImageIcon icon;// icon 이 인터페이스여서 d일반클래스로 가져왔어 !
	
	String ori="C:/java_workspace2/project0327/res/memo.txt";//원본
	String dest="C:/java_workspace2/project0327/res/memo_copy.txt"; //다른 파일의 저장경로
	FileInputStream fis;
	FileOutputStream fos;
	
	InputStreamReader reader; //문자기반 입력스트림
	BufferedReader buffr; //버퍼처리된 문자기반 입력스트림! ->속도향상을 위해 
	
	OutputStreamWriter writer;//문자기반의출력스트림
	PrintWriter writer2;//문자기반의 출력 스트림 위에거랑 같은데 깨지는 사람들이 있어서 새거로 !
	
	public MemoEditor(){
		p_north=new JPanel();
		icon=new ImageIcon("C:/java_workspace2/project0327/res/folder_on.png");
		bt_open=new JButton(icon);
		bt_save=new JButton("저장");
		area=new JTextArea();
		scroll=new JScrollPane(area);
		
		p_north.add(bt_open);
		p_north.add(bt_save);
		
		add(p_north,BorderLayout.NORTH);
		add(scroll);
		
		bt_open.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		
		bt_open.setBorderPainted(false);
		bt_open.setContentAreaFilled(false);
		bt_open.setFocusPainted(false);
		bt_open.setOpaque(false);
		
		
		bt_save.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(700, 600);
		
	}
	
	//열기
	public void open(){
		try{
			fis = new FileInputStream(ori);
			
			//문자기반 스트림에는 문자인코딩 속성을 지정할 수 있다
			reader = new InputStreamReader(fis, "utf-8"); 
			buffr= new BufferedReader(reader);
			String data; //첨에 int 였다가 readline의 반환형이 String
			//string 은 객체니까 null 값을 가지고있지
			int count=0; // read 횟수를 알아보기 위해서 ! 
			
			while(true){
				data=buffr.readLine();//fis.read()1byte 읽어들인다 //reader.read 2바이트씩읽어들임 //read 는 글자하나당 read 읽힘 엄청난 양이라고 생각하면된다 따라서 buffer처리된 스트림을 이용하자
				//버퍼에 모아진 것을 엔터쳤을 때 딱 올라간다 ! -> 속도 향상을 위해 (버퍼처리된 스트림)
				count++;
				
				if(data==null)break; //data==-1 
				area.append(data+"\n");
			}
			System.out.println("count="+count);
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(this,"파일이 존재하지 않습니다");
			e.printStackTrace();	//개발자를 위한 에러 로그 정보 
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}

	//저장하기
	public void save(){
		try {
			//FileOutputStream 은 지정한 경로의 파일을 생성해버린다
			//(크기는 0바이트인 empty 빈 파일)
			fos =new FileOutputStream(dest);
			//writer=new OutputStreamWriter(fos, "utf-8");
			//writer.write(area.getText());
			writer2=new PrintWriter(fos);	
			writer2.write(area.getText());
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}//catch(UnsupportedEncodingException e){
			//e.printStackTrace();			
		//}
		catch (IOException e) {			
			e.printStackTrace();
		}finally{
			//열어놓은 스트림은 전부 닫는 처리 그래야 열릴ㄸㅐ 제대로 열림
			if(writer2 !=null){ //존재한다면 닫는다
				writer2.close();
				//try {
				//	writer.close();
				//} catch (IOException e) {	
					//e.printStackTrace();
				//}
				if(fos!=null){
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}				
				}				
			}
		}
	}
	
	public static void main(String[] args) {
		new MemoEditor();
	}

}
