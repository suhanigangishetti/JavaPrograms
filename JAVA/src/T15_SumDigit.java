
import java.util.Scanner;

public class T15_SumDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enetr a num");
        int n=sc.nextInt();
        int r,sum=0,t;
        t=n;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.err.println("Sum of digits:" +t+ "is"+sum);

    }
    
}
