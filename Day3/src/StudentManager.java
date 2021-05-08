
public class StudentManager extends UserManager{
	
	public void reminder(Student student){
        System.out.println("Course reminder mail has sent: " + student.getEmail()+"\n");       
    }

}
