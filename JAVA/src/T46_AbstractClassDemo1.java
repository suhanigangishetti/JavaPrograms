interface Shape2{
	double area();
	
}
class Rectangle1 implements Shape2{
	double l,b;
	Rectangle1(double l,double b){
		this.l=l;
		this.b=b;
		
	}
	public double area(){
		return l*b;
		
	}
	
}
class Circle3 implements Shape2{
	double r;
	Circle3(double r){
		this.r=r;
		
	}
	public double area() {
		return Math.PI*r*r;
	}
}
public class T46_AbstractClassDemo1{
	public static void main(String[] args) {
		Shape2 s;
		s=new Rectangle1(12,5);
		System.out.println("area of rect"+s.area());
	    s=new Circle3(12.5);
		System.out.println("area of cirlce"+s.area());
		
		
	}

}
