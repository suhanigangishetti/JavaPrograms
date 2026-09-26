class Sample11 implements Runnable//step1
{
	Thread t;
	Sample11(String name) {
		t=new Thread(this,name);         //step4 
		t.start();	                    //step5
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread() +"count: "+i);
		}
	}
}
public class T59_Runnable {
	public static void main (String[] args) {
		new Sample11("first");
		new Sample11("second");
		new Sample11("third");
		
		
	}

}