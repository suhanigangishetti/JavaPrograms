class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	
	void setAccountDetails(int accountNo,String accountType,int accountBalance) {
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void withdraw(int amount) {
		this.accountBalance-=amount;
		
	}
	void depoist(int amount) {
		this.accountBalance+=amount;
	}
	void dispAccountDetails() {
		System.out.println("Account No:"+accountNo+"Type: "+accountType+"Balance:"+accountBalance);
	}
}
public class T34_AccountDemo {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccountDetails(12345, "SB", 10000);
		a1.dispAccountDetails();
		a1.depoist(1000);
		a1.dispAccountDetails();
		a1.withdraw(1500);
		a1.dispAccountDetails();
		
	}

}

