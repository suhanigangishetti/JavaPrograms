
import java.util.Scanner;

class Rectangle{
    double length,breadth;

    Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }
    
}
public class T39_AreaOfRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter length and breadth");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        Rectangle r=new Rectangle(l, b);
        System.out.println("area of rectangle:"+r.area());
        sc.close();

    }


    
}

