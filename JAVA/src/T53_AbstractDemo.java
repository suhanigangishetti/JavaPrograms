abstract class Vehicle{
	abstract void drive();
	void applyBreak() {
		System.out.println("applying break");
	}
}
	class Car1 extends Vehicle{
		void drive() {
			System.out.println("driving a car");
		}
		void changeGear() {
			System.out.println("changing gear");
		}
	}
	public class T53_AbstractDemo{
		public static void main(String[] args) {
			//vehicle v=new vehicle;//error
			Vehicle v=new Car1();
			v.drive();
			v.applyBreak();
			//v.changeGear;//error
			Car1 c=new Car1();
			c.changeGear();
		}
	}

