/*
FileInputStream ���� �����ڰ� ���ϴ� ������ ��Ʈ���� ������ �� ������ 
Ű����� ���� ǥ�� �Է� �ϵ�ؾ��� ��쿣
�ڹٰ� ��Ʈ���� �������� ���ϰ� �ش� OS�� �����ϹǷ�, 
�ڹ� �����ڴ� OS�κ��� ǥ���Է� ��Ʈ���� ���;� �Ѵ� .

�ڹ��� Ŭ���� �� System Ŭ������ static ������� �� �� has a ����� ������ 
InputStream�� in��ü�� �ٷ� ǥ���Է� ��Ʈ���� �޾Ƴ��� Ŭ�����̴�
���� ���ÿ� �׳� System.in;

���ڱ�� ��Ʈ�� Ŭ������ �̸� ��Ģ (���� �ѱ� �ȱ����� �ٸ��� ����)
�Է� : ~~Reader
��� : ~~Writer 


*/

package io;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class KeyBoardApp{
	public static void main(String[] args){
		InputStream is=System.in;

		//���ڱ�� ��Ʈ���� �ܵ��� �����ϴ� ���� �ƴ϶�, �̹� ����Ʈ ��� ��Ʈ���� ������ �Ѵ�.
		//���� ������ �������� �μ��� ����Ʈ ��� ��Ʈ���� �ִ´�!

		InputStreamReader reader=null;
		reader =new InputStreamReader(is);

	
		int data;
		try{
			while(true){		
				data=reader.read(); // 1byte �� �о���� (is.read) // 2����Ʈ - reader.read
				System.out.print((char)data);  //�Էµ� �� 3�� a ������ enter �� Ŀ���ٲٱ�� �ٹٲ� �� ���Ե� �� ! (���ʹ� ��ɸ��� ����Ѵ�!)
			}
		}catch(IOException e){
		
		
		}
	
	
	}

}
