
public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Neslihan","Caner");
		UserManager userManager=new UserManager();
		userManager.add(user);
		
		Instructor instructor=new Instructor("Engin","Demiroğ","Software Engineer");
		Instructor instructor2=new Instructor("Kerem","Varış","Software Engineer");
		
		Student student =new Student(1,"Nursebil","Canbolat","191118006","Software Engineering");
		Student student2 =new Student(2,"Aslıhan","Caner","191118009","Software Engineering");
		
		
		Instructor[] instructors= {instructor,instructor2};
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.getAll(instructors);
		
		Student[] students= {student,student2};
		StudentManager studentManager=new StudentManager();
	    studentManager.getAll(students);
		
		User[] users={user,instructor,instructor2,student,student2};
		userManager.getAll(users);
	}

}
