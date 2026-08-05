import java.util.Scanner;

public class T21_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        double r= sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.println("Area of circle:"+area);
        sc.close();
    }
}

