package assignment10;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("My Student name is Archana");

	}
	public void studentDept() {
		System.out.println("My Student department is CSE");

	}
	public void studentId() {
		System.out.println("My Student id is 51146004");

	}

	public static void main(String[] args) {
		System.out.println("********Multilevel Inheritance********");
		System.out.println("********College class********");
		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		
		System.out.println("********Department class********");
		Department dept =new Department();
		dept.deptName();
		
		System.out.println("********Student class********");
		Student stud = new Student();
		stud.studentName();
		stud.studentId();
		stud.studentDept();

	}

}
