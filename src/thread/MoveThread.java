//������ ������ ��Ե� ������! 
package thread;

public class MoveThread extends Thread{
	AniMain aniMain;
	
	public MoveThread(AniMain aniMain){ //������ ȣ���ϴϱ� �����ڸ޼���� �޾ƿ���
		this.aniMain=aniMain;
		
	}
	//�����ڴ� ��������� �ڵ带 run�� ����!
	//JVM�� run�� �˾Ƽ� ȣ�����ش� 
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
