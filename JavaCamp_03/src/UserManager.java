
public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName+" added");
	}
	public void delete(User user) {
		System.out.println(user.firstName+" deleted");
	}
	public void getAll(User[] users) {
		System.out.println("T�m kullan�c�lar : ");
		for (User user : users) {
			
			System.out.println(user.firstName+" "+user.lastName );
		}
		
	}
	
}
