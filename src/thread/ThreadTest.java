/*OS가 여러 프로세스들을 동시에 수행하면서 관리할수 있듯(multi-tasking)
 하나의 자바프로그램 내에서 세부적 실행단위를 만들어 동시에 수행시킬 수 있다 
 이러한 세부적 실행단위를 쓰레드라 한다 
 
 자바는 개발자가 정의하지 않아도 이미 기본적으로 제공되는 실행용쓰레드가 있으며
 이러한 쓰레드를 가리켜 메인쓰레드라한다
 결국 자바는 쓰레드 기반이다!*/
package thread;

public class ThreadTest {
	//메인쓰레드 말고, 개발자가 원하는 사용자정의 쓰레드 하나 만들어서 원하는 작업을 동시에 시켜보자
	MyThread thread; //java.land 에 소속 기본 범위인거지!!
	//재정의했으니까 MyThread 
	
	//생성자하나 만들고 호출하자
	public ThreadTest(){
		//메인쓰레드와는 독립적으로 실행될 수 있는 세부 실행단위를 생성함!
		//쓰레드가 어떤일을 할지는 개발자가 결정해야하기 때문에 쓰레드를 재정의하자 ! =상속받자!클래스 하나만들어서 
		
		thread=new MyThread();
		//thread.run();//분신이 만들어졌는데 분신이 직접 실행하고 있음 run을 호출하는 것은 시스템에게 맡기는거가 되지않고 , 직접 수행하게끔함 
		
		
		thread.start(); //MyThread의 run을 수행하고자 왜 start? 왜 흰별먼저 찍히징?? - > 의미 JVM님이 해주세요 
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("☆");
		}
		
	}//main 쓰레드는 우리가 생각하는 실행부였던거다 ! 
	
	
	
	public static void main(String[] args) {
		//int[] arr=new int[3];
		//System.out.println(arr[3]); //runtime excpetion 수행타임의 에러 Exception in thread "main
		new ThreadTest();

		
	
	}

}
