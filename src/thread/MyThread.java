/*
 ���ü����ϰ� ���� �ڵ�� 
 �����ڰ� �����ؾ��ϱ� ������
 �����带 ������ �ؾ��Ѵ�!*/
package thread;

public class MyThread extends Thread{

	/*�����ڴ� ���������� �����ϰ� ���� �ڵ带 �������� run�޼���ȿ� �ۼ��ϸ� �ȴ�!
	 */
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000); //1�� ���� ��  , �ڵ� ��ų�� �ִٰ� ������ ��� sun���� ĳġ��
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("��");
		}
	}
}
