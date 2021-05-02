
public class StudentManager {

	public void add(Student student) {
		System.out.println(student.firstName+" added");
	}
	public void delete(Student student) {
		System.out.println(student.firstName+" deleted");
	}
	public void getAll(Student[] students) {
		System.out.println("Öğrenciler : ");
		for (Student student : students) {
		
			System.out.println(student.firstName+" "+student.lastName );
		}
		
	}
}
