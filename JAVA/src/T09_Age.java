
import java.util.Scanner;
public class T09_Age {
	    public static void main(String[] args) {
	                Scanner sc=new Scanner(System.in);
	                System.out.println("eneter age:");
	                int age=sc.nextInt();
	                if(age>0)
	                {
	                    if(age>=18){
	                        System.out.println("major");
	                    }
	                    else{
	                        System.out.println("mnior");
	                    }
	                }
	                else{
	                    System.out.println("invalid");
	                }
	}


}
