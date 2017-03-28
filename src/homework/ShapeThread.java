//��, �簢�� � ������ ǥ���� ��ü�̵� ��� �� Ŭ������ �ڽ����� ���� ! 
//�� ? ? ������ Ư¡�� �����Ƿ� �ֻ�����ü�� ����! Game Objectó�� 
package homework;

import java.awt.Color;
import java.awt.Graphics;

abstract public class ShapeThread extends Thread{
	int x;
	int y;
	int width;
	int height;
	int interval;
	Graphics g; 
	
	//�ʱ�ȭ�� ���� ������ �����!
	public ShapeThread(int x,int y, int width, int height, int interval,Graphics g){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.interval=interval;
		this.g=g;
		
		start(); //�ʱ�ȭ��! 
		
	}
	
	
	
	//�߻�޼���� ������ �ڽĶ����� ���������Ҽ� �ְ�!~  render��� �ִ� �پ��ϴϱ� �����⼭ �������� �ʰ� �ڽĶ����� ����->�߻�޼���
	abstract public void render();
	
	
	public void run() {
		while(true){
			try {
				Thread.sleep(interval); //���� �ð���
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			render(); 
			
		}
	}
	
	
}
