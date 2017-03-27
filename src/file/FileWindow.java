/*
 클래스는 코드의 재사용때문에 나온 기술이다 !
 이 클래스는 재사용성이 있는 클래스이다! 
 */
package file;

import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
//ch 자바에서는 이미지도 클래스패스로 지정 가능


public class FileWindow extends JFrame{
	//ImageIcon folder_on, folder_off;
	MyIcon folder_on, folder_off; //d이제부터ImageIcon은 myicon으로
	
	public FileWindow() {
		setLayout(new FlowLayout());
		
		//이미지 아이콘을 생성하되, 리소스 폴더로부터
		//Uniformed Resource Locator; =url 브라우저상 뿐 아니라 로컬상의 주소값도 가져올 수 있음
		//URL url=imagethis.getClass().getReSource("/folder_on.png");
		//folder_on=new ImageIcon() ->원래 선언! 그안에 바로 url 꽂아주자
		
		folder_on=new MyIcon(this.getClass().getResource("/folder_on.png"),50,50);
		folder_off=new MyIcon(this.getClass().getResource("/folder_off.png"),50,50);
		
		//아이콘을 직접 만들지 않고 이미지를 얻어와서 조정하기
		//Image scaledImg=folder_on.getImage();
		//크기를 재조정한 후 결과적으로 이미지 객체를 다시 가져온다
		//Image result=scaledImg.getScaledInstance(50,50,Image.SCALE_SMOOTH);
		//결국 위에것이 재조정된 결과물 ! ->이미지 아이콘에 반영하자 
		//folder_on.setImage(result);
		
		//제대로 붙을 지 테스트 
		ArrayList<String> list=getDirList(); //getDirList 반환형은 ArrayList
		for(int i=0;i<list.size();i++){
			String dirName=list.get(i);
			MyPanel mp=new MyPanel(dirName,folder_off ); //MyPanel(workspace ,folder_on ); 여기서 전체배열로 해주기위해 dirName가져다 주기
			add(mp);
		}
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//원하는 경로에 하위 디렉토리/파일 구하기
	public ArrayList getDirList(){
		File file = new File("c:/");
		
		File[] fileList=file.listFiles();
		ArrayList<String> dirList=new ArrayList<String>();
		//ArrayList<String> 이거 자체를 하나의 자료형으로 봐라
		
		
		//디렉토리만 골라내자
		for(int i=0;i<fileList.length;i++){
			if(fileList[i].isDirectory()){
				//디렉토리가 발견될 때마다 리스트에 추가 
				dirList.add(fileList[i].getName());
			}
			
		}
		return dirList;
		
	}
	
	public static void main(String[] args) {
		new FileWindow();
	
	}

}
