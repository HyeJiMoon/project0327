/*OS�� ���� ���μ������� ���ÿ� �����ϸ鼭 �����Ҽ� �ֵ�(multi-tasking)
 �ϳ��� �ڹ����α׷� ������ ������ ��������� ����� ���ÿ� �����ų �� �ִ� 
 �̷��� ������ ��������� ������� �Ѵ� 
 
 �ڹٴ� �����ڰ� �������� �ʾƵ� �̹� �⺻������ �����Ǵ� ����뾲���尡 ������
 �̷��� �����带 ������ ���ξ�������Ѵ�
 �ᱹ �ڹٴ� ������ ����̴�!*/
package thread;

public class ThreadTest {
	//���ξ����� ����, �����ڰ� ���ϴ� ��������� ������ �ϳ� ���� ���ϴ� �۾��� ���ÿ� ���Ѻ���
	MyThread thread; //java.land �� �Ҽ� �⺻ �����ΰ���!!
	//�����������ϱ� MyThread 
	
	//�������ϳ� ����� ȣ������
	public ThreadTest(){
		//���ξ�����ʹ� ���������� ����� �� �ִ� ���� ��������� ������!
		//�����尡 ����� ������ �����ڰ� �����ؾ��ϱ� ������ �����带 ���������� ! =��ӹ���!Ŭ���� �ϳ����� 
		
		thread=new MyThread();
		//thread.run();//�н��� ��������µ� �н��� ���� �����ϰ� ���� run�� ȣ���ϴ� ���� �ý��ۿ��� �ñ�°Ű� �����ʰ� , ���� �����ϰԲ��� 
		
		
		thread.start(); //MyThread�� run�� �����ϰ��� �� start? �� �򺰸��� ����¡?? - > �ǹ� JVM���� ���ּ��� 
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("��");
		}
		
	}//main ������� �츮�� �����ϴ� ����ο����Ŵ� ! 
	
	
	
	public static void main(String[] args) {
		//int[] arr=new int[3];
		//System.out.println(arr[3]); //runtime excpetion ����Ÿ���� ���� Exception in thread "main
		new ThreadTest();

		
	
	}

}
