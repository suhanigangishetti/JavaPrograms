
import java.util.Scanner;

public class T11_Vowels {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter  char: ");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;

            default:System.err.println("consonent");break;   
   
                
        }

        sc.close();
    }
}