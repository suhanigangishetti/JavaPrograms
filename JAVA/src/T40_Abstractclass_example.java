abstract class Shape {
    String color="Red";
    //Abstract method-no body
    abstract double area();
    //concrete method
    void display(){

    System.out.println("color:" +color);

    }
   
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
    	this.radius=radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
public class T40_Abstractclass_example{
	public static void main(String[] args) {
		Circle c=new Circle(12.50);
		System.out.println("circle area:"+c.area());
		c.display();
		
	}
	
}