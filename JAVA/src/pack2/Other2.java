package pack2;
import pack1.base;
public class Other2 {
	base b1=new base();
	public Other2() {
		System.out.println("other2 constructor");
		//System.out.println("n="+ b1.n);
		//System.out.println("n_pri="+b1.n_pri);
		//System.out.println("n_pro="+ b1.n_pro);
		System.out.println("n_pub="+ b1.n_pub);
	}

}
