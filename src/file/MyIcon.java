//아이콘 생성시 그 크기를 조정하려면 코드가 복잡하므로 
//앞으로 재사용가능성을 염두에두고 나만의 재조정이미지 아이콘을 새로 정의해본다

package file;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class MyIcon extends ImageIcon{
	public MyIcon(URL url,int width, int height){
		//folder_on=new ImageIcon(this.getClass().getResource("/folder_on.png"));
		//여기서 new 는 어색하지 이미 만들어진걸 사용하는데 그리고 super로 호출하면 부모를 호출하는 것이뎀!
		super(url);//이 코드에선 super보다 this가 호출먼저되ㅐ 그래서 url그냥넘겨받자
	
		//아이콘을 직접 만들지 않고 이미지를 얻어와서 조정하기
		Image scaledImg=this.getImage();
		//크기를 재조정한 후 결과적으로 이미지 객체를 다시 가져온다
		Image result=scaledImg.getScaledInstance(width,height,Image.SCALE_SMOOTH);
		//결국 위에것이 재조정된 결과물 ! ->이미지 아이콘에 반영하자 
		this.setImage(result);
		
		
	}

}
