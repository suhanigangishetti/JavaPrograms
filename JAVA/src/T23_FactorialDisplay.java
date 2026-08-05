import java.util.Scanner;
public class T23_FactorialDisplay {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enetr a num");
        int n=sc.nextInt();
        long f=1;
        System.err.println("___________________");
        System.err.println("Number    Factorial");
        System.err.println("____________________");
        for(int i=1;i<=5;i++){
            f=1;
            for(int j=1;j<=i;j++){
                f=f*j;
            }
            System.err.println(i+"        "+f);
        }
            System.err.println("-----------------");

    }
    
}