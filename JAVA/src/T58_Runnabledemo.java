class Sample1 implements Runnable//step1
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread() +"count: "+i);
		}
	}
}
public class T58_Runnabledemo {
	public static void main (String[] args) {
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
		Sample1 s3=new Sample1();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		Thread t3=new Thread(s3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
