
public class Student extends User{

	String studentNumber;
	String studentDepartment;
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String studentNumber, String studentDepartment) {
		super(id, firstName, lastName);
		this.studentNumber = studentNumber;
		this.studentDepartment = studentDepartment;
	}
	
}
