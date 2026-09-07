
public class T47_ExpDemo {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Exceptin Demo");
		try {
			c=a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("result"+c);
		
	
	}

}
