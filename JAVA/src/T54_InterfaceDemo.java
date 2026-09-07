interface Shape{
	void draw();
	default void fill() {
		System.out.println("filling");
	}
}
class Circle implements Shape{
	public void draw()
	System.out.println("Drawing a circle");
}
public class T54_InterfaceDemo {
	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
		s.fill();
	}

}
