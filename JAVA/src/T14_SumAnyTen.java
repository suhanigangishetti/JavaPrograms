
import java.util.Scanner;
public class T14_SumAnyTen   {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

