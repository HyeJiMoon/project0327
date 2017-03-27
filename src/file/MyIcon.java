//������ ������ �� ũ�⸦ �����Ϸ��� �ڵ尡 �����ϹǷ� 
//������ ���밡�ɼ��� ���ο��ΰ� ������ �������̹��� �������� ���� �����غ���

package file;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class MyIcon extends ImageIcon{
	public MyIcon(URL url,int width, int height){
		//folder_on=new ImageIcon(this.getClass().getResource("/folder_on.png"));
		//���⼭ new �� ������� �̹� ��������� ����ϴµ� �׸��� super�� ȣ���ϸ� �θ� ȣ���ϴ� ���̵�!
		super(url);//�� �ڵ忡�� super���� this�� ȣ������Ǥ� �׷��� url�׳ɳѰܹ���
	
		//�������� ���� ������ �ʰ� �̹����� ���ͼ� �����ϱ�
		Image scaledImg=this.getImage();
		//ũ�⸦ �������� �� ��������� �̹��� ��ü�� �ٽ� �����´�
		Image result=scaledImg.getScaledInstance(width,height,Image.SCALE_SMOOTH);
		//�ᱹ �������� �������� ����� ! ->�̹��� �����ܿ� �ݿ����� 
		this.setImage(result);
		
		
	}

}
