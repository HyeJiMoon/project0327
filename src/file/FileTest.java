/*
 �ڹٿ����� ���丮�� �����ϱ����� Ŭ������ ������ �������� �ʰ�,
 ���丮�� ���Ϸ� ����
 ��� : java.io.File Ŭ������ ���� + ���丮���� ó���Ѵ� !
 
 */

package file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		//C����̺꿡 ������ �����ϴ� ��� ���丮 �� ������ ����غ���
		File file=new File("c:/");
		//���� ���丮 �� ������ ��� ����
		File[] dir=file.listFiles(); //��ܸ������� //������ü�� �迭�� �ޱ� String dir=file.list ���� �� ���� ���� �� ����
		
		
		for(int i=0;i<dir.length;i++){
			//File file=dir[i];
			if(dir[i].isDirectory()){
				System.out.println(dir[i].getName());
			}
		}
	}
}
