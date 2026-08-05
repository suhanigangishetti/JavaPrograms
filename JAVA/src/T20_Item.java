
import java.util.Scanner;

public class T20_Item  {
    
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int option,itemNumber,quantity;
                double rate,price;
                String itemName;
                do { 
                    System.err.println("enter item number");
                    itemNumber=sc.nextInt();
                    sc.nextLine();
                    System.err.println("enter item name");
                    itemName=sc.nextLine();
                    System.err.println("enter rate");
                    rate=sc.nextDouble();
                    System.err.println("enter quantity");
                    quantity=sc.nextInt();
                    price=rate*quantity;
                    System.err.println("item number: "+itemNumber+"name: "+itemName+" Rate:");
                    System.err.println("enter option");
                    option=sc.nextInt();


                    
                    
                } while (option!=-1);
                System.err.println("thankyou!!");

}
}
