class A{
	int a=10,b=20;
	public String toString() {
		return a+"class A"+b;
	}
}
public class T41_Demo {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		System.out.println(a1+":"+a2);
	}

}
