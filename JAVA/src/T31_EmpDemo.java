public class T31_EmpDemo {
    // Data members
    String empName;
    int empNumber;
    double empSalary;

    // Method to set employee details
    void setEmpDetails(int empNumber, String empName, double empSalary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // Method to display employee details
    void displayEmpDetails() {
        System.out.println("Employee Name   : " + empName);
        System.out.println("Employee Number : " + empNumber);
        System.out.println("Employee Salary : " + empSalary);
    }

    // Main method
    public static void main(String[] args) {

        // Create object of the class
        T31_EmpDemo emp = new T31_EmpDemo();

        // Set employee details
        emp.setEmpDetails(101, "Rahul", 5000.0);

        // Display employee details
        emp.displayEmpDetails();
    }
}