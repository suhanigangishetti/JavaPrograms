import java.util.Scanner;

public class T19_Leapyear {

    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("eneter year:");
                int year=sc.nextInt();
                if((year%4==0)||(year%4==0&&year%100==0)){
                    System.err.println("leapyear");
                }
                else{
                    System.err.println("not a leap year");
                }
    
}
}

