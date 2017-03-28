//움직임 로직을 담게될 쓰레드! 
package thread;

public class MoveThread extends Thread{
	AniMain aniMain;
	
	public MoveThread(AniMain aniMain){ //어차피 호출하니까 생성자메서드로 받아오자
		this.aniMain=aniMain;
		
	}
	//개발자는 독립실행될 코드를 run에 기재!
	//JVM이 run을 알아서 호출해준다 
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			aniMain.move();
		}
	}
}
