
public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.firstName+" added");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName+" deleted");
	}
	public void getAll(Instructor[] instructors) {
		System.out.println("Eðitmenler: ");
		for (Instructor instructor : instructors) {
		
			System.out.println( instructor.firstName+" " +instructor.lastName);
		}
		
	}
}
