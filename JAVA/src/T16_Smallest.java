import java.util.Scanner;

public class T16_Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,small=1200;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter"+(i+1)+"st/rd/th number:");
            n=sc.nextInt();
            if(n<small) {
                small=n;
            }
            System.err.println("small:"+small);

          
        }
    }
}
