class Accountf{
	int accno;
	String accountType;
	int accbal;
	
	Accountf(int accno,String accountType, int accbal) {
		this.accno=accno;
		this.accountType=accountType;
		this.accbal=accbal;
	}
	
	void withdraw(int amount) {
		if(accbal>amount)
		this.accbal-=amount;
		else 
			System.out.println("Insuficient Balance!!");
	}
	
	void deposit(int amount) {
		this.accbal+=amount;
	}
	
	void disAccountDetails() {
		System.out.println("Account number:"+accno+" Type:"+accountType+" Balance:"+accbal);
	}
	
}
public class T35_Account1 {

	public static void main(String[] args) {
		Accountf a1=new Accountf (6309426 , "SB", 10000);
		a1.disAccountDetails();
		a1.deposit(1000);
		a1.disAccountDetails();
		a1.withdraw(1500);
		a1.disAccountDetails();
		

	}

}
