
	import java.util.Scanner;
	public class T08_Greater {



	    public static void main(String[] args) {
	                Scanner sc=new Scanner(System.in);
	        System.out.println("enter nums:");
	        int a= sc.nextInt();
	        int b= sc.nextInt();
	        int c= sc.nextInt();
	        System.out.println((a>b&&a>c)?a:(b>c)?b:c);
	    }
	    
	}

