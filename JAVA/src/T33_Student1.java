class Student3{
	int rollno,mark1,mark2,mark3,totalmarks;
	String studname;
	
	Student3(int rollno,String studname, int mark1,int mark2, int mark3) {
		this.rollno=rollno;
		this.studname=studname;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	void calTotal() {
		totalmarks=mark1+mark2+mark3;
	}
	
	void disStuDetails() {
		System.out.println("Roll No: "+rollno+" Name: "+studname+" Total Marks: "+totalmarks);
	}
}
public class T33_Student1 {

	public static void main(String[] args) {
		
		Student3 s1=new Student3 (201,"Rash",25,26,30);
		s1.calTotal();
		s1.disStuDetails();

			}

}
