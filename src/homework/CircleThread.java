//원을 표현한 객체 및 그 움직임 
package homework;

import java.awt.Color;
import java.awt.Graphics;

public class CircleThread extends ShapeThread{ //부모가 Shape로 바뀜 부모가 바뀌닌까 여기서 멤버변수는 필요없지 


	public CircleThread(int x,int y, int width, int height,int interval,Graphics g) {
		super(x,y,width,height,interval,g);
	}
	
	
	public void render(){
		//render 그래픽처리를한다
		//System.out.println(g);
		//생긴원을 지우자 = 노란색페인트를 윈도우에 적용하고
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 700, 600);
		
		//원을 다시그리자
		x+=2;
		g.setColor(Color.BLACK);
		g.drawOval(x,y,width,height);
		
		
	}

}

