class AlertThread extends Thread{
	AlertThread(String name,int priority){
		super(name);
		setPriority(priority);
		
	}
	public void run() {
		System.out.println(getName()+" "+"[priority:"+getPriority()+"] running");
		
	}
}
public class T60_HospitalSystem {
	public static void main(String[] args) {
		AlertThread routine=new AlertThread("Routine-Report",Thread.MIN_PRIORITY);
		AlertThread normal=new AlertThread("patient-moniter",Thread.NORM_PRIORITY);
		AlertThread critical=new AlertThread("code red alert",Thread.MAX_PRIORITY);
		routine.start();
		normal.start();
		critical.start();
		//codered-alert gets most cpu time from os s
	}

}
