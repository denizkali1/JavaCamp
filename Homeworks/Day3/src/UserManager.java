
public class UserManager {
	
	   public void add(User user){
	        System.out.println("User added: " + user.getName() + " " + user.getSurname()+"\n");
	        
	    }
	     public void delete(User user){
	        System.out.println("User deleted: " + user.getName() + " " + user.getSurname()+"\n");
	        
	    }
	     public void update(User user){
	        System.out.println("User updated:" + user.getName() + " " + user.getSurname()+"\n");
	        
	    }

}
