class Sample extends Thread//step1
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(currentThread() +"count: "+i);
		}
	}
}
public class T57_ThreadDemo {
	public static void main (String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		s1.start();
		s2.start();
		s3.start();
		  
		
	}

}
