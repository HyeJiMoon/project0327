/*
 Ŭ������ �ڵ��� ���붧���� ���� ����̴� !
 �� Ŭ������ ���뼺�� �ִ� Ŭ�����̴�! 
 */
package file;

import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
//ch �ڹٿ����� �̹����� Ŭ�����н��� ���� ����


public class FileWindow extends JFrame{
	//ImageIcon folder_on, folder_off;
	MyIcon folder_on, folder_off; //d��������ImageIcon�� myicon����
	
	public FileWindow() {
		setLayout(new FlowLayout());
		
		//�̹��� �������� �����ϵ�, ���ҽ� �����κ���
		//Uniformed Resource Locator; =url �������� �� �ƴ϶� ���û��� �ּҰ��� ������ �� ����
		//URL url=imagethis.getClass().getReSource("/folder_on.png");
		//folder_on=new ImageIcon() ->���� ����! �׾ȿ� �ٷ� url �Ⱦ�����
		
		folder_on=new MyIcon(this.getClass().getResource("/folder_on.png"),50,50);
		folder_off=new MyIcon(this.getClass().getResource("/folder_off.png"),50,50);
		
		//�������� ���� ������ �ʰ� �̹����� ���ͼ� �����ϱ�
		//Image scaledImg=folder_on.getImage();
		//ũ�⸦ �������� �� ��������� �̹��� ��ü�� �ٽ� �����´�
		//Image result=scaledImg.getScaledInstance(50,50,Image.SCALE_SMOOTH);
		//�ᱹ �������� �������� ����� ! ->�̹��� �����ܿ� �ݿ����� 
		//folder_on.setImage(result);
		
		//����� ���� �� �׽�Ʈ 
		ArrayList<String> list=getDirList(); //getDirList ��ȯ���� ArrayList
		for(int i=0;i<list.size();i++){
			String dirName=list.get(i);
			MyPanel mp=new MyPanel(dirName,folder_off ); //MyPanel(workspace ,folder_on ); ���⼭ ��ü�迭�� ���ֱ����� dirName������ �ֱ�
			add(mp);
		}
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//���ϴ� ��ο� ���� ���丮/���� ���ϱ�
	public ArrayList getDirList(){
		File file = new File("c:/");
		
		File[] fileList=file.listFiles();
		ArrayList<String> dirList=new ArrayList<String>();
		//ArrayList<String> �̰� ��ü�� �ϳ��� �ڷ������� ����
		
		
		//���丮�� �����
		for(int i=0;i<fileList.length;i++){
			if(fileList[i].isDirectory()){
				//���丮�� �߰ߵ� ������ ����Ʈ�� �߰� 
				dirList.add(fileList[i].getName());
			}
			
		}
		return dirList;
		
	}
	
	public static void main(String[] args) {
		new FileWindow();
	
	}

}
