
public class Main {

	public static void main(String[] args) {
		
		  Student student = new Student(1,"Deniz","Kalı","deniz@example.com","College");
	      Instructor instructor = new Instructor(1,"Engin","Demiroğ","engin@example.com","Software Development");
	      
	      StudentManager studentManager = new StudentManager();
	      studentManager.add(student);
	      studentManager.reminder(student);

	      InstructorManager instructorManeger = new InstructorManager();
	      instructorManeger.add(instructor);

	}

}
