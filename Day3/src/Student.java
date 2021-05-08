
public class Student extends User {
	String educationLevel;
	
	public Student() {
		
	}
	

	public Student(int id, String name, String surname, String email, String educationLevel) {
		super(id,name,surname,email);
		this.educationLevel = educationLevel;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
	

}
