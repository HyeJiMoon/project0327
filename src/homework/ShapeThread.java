//원, 사각형 어떤 도형을 표현한 객체이든 모두 이 클래스의 자식으로 두자 ! 
//왜 ? ? 공통적 특징이 있으므로 최상위객체로 두자! Game Object처럼 
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
	
	//초기화를 위해 생성자 만들기!
	public ShapeThread(int x,int y, int width, int height, int interval,Graphics g){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.interval=interval;
		this.g=g;
		
		start(); //초기화때! 
		
	}
	
	
	
	//추상메서드로 남기자 자식때에서 강제정의할수 있게!~  render라는 애는 다양하니까 여ㅑ기서 정의하지 않고 자식때에서 정의->추상메서드
	abstract public void render();
	
	
	public void run() {
		while(true){
			try {
				Thread.sleep(interval); //변수 시간차
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			render(); 
			
		}
	}
	
	
}
