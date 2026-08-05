class Student {
    int rollNum, mark1, mark2, mark3, totalMarks;
    String studName;

    void setStudDetail(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }

    void displayStudDetails() {
        System.out.println("Roll No: " + rollNum+"Name: " + studName+"Total Marks: " + totalMarks);

    }
}

public class T32_StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setStudDetail(123, "Alice", 31, 25, 27);
        s1.calculateTotal();
        s1.displayStudDetails();
    }
}

