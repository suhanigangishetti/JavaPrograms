
	import java.util.Scanner;
	public class T07_Factorial {


	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.err.println("enetr a number");
	        int n=sc.nextInt();
	        long f=1;
	        for(int i =1;i<=n;i++){
	            f=f*i;
	        }
	        System.out.println("factorial of"+n+"is: "+f);
	    }
	    
}

