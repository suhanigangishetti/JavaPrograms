import java.util.Scanner;

class Customer {
    int custId;
    String custName, custAddress;

    Customer(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    void display() {
        System.out.println("Customer Id: " + custId + " Customer Name: " + custName + " Customer Address: " + custAddress);
    }
}

class Account2 {
    int accId;
    String accType;
    Customer cust;
    double accBalance;

    Account2(int accId, String accType, Customer cust, double accBalance) {
        this.accId = accId;
        this.accType = accType;
        this.cust = cust;
        this.accBalance = accBalance;
    }

    void display() {
        cust.display();
        System.out.println("Account Id: " + accId + " Account Type: " + accType + " Account Balance: " + accBalance);
    }
}

public class T36_CustomerAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer id, name, address");
        int id = sc.nextInt();
        sc.nextLine();          // Fixed
        String name = sc.nextLine();
        String addr = sc.nextLine();

        Customer c = new Customer(id, name, addr);

        System.out.println("Enter account id, type, balance");
        int aid = sc.nextInt();
        sc.nextLine();          // Fixed
        String type = sc.nextLine();
        double bal = sc.nextDouble();

        Account2 acc = new Account2(aid, type, c, bal);
        acc.display();

        sc.close();
    }
}
