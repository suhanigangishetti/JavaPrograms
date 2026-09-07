abstract class Shape{
	void display() {
		System.out.println("shape base class");
		
	}
	abstract double area();
	
}
class Rectangle extends Shape{
	double l,b;
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
		
	}
	double area(){
		return l*b;
		
	}
	
}
class Circle extends Shape{
	double r;
	Circle(double r){
		this.r=r;
		
	}
	double area() {
		return Math.PI*r*r;
	}
}
public class T45_AbstractClassDemo {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(12,5);
		System.out.println("area of rect"+r.area());
		Circle c=new Circle(12.5);
		System.out.println("area of cirlce"+c.area());
		
		
	}

}
