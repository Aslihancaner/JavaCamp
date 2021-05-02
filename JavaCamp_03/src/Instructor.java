
public class Instructor extends User {

	String instrucorDepartment;
	
	public Instructor( String firstName, String lastName,String instrucorDepartment) {
		this.instrucorDepartment = instrucorDepartment;
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public Instructor() {
		
	}
	
}
