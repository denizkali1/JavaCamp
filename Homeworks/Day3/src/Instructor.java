
public class Instructor extends User {
	String proffesion;
	
	public Instructor() {
		
	}

	public Instructor(int id, String name, String surname, String email, String proffesion) {
		super(id,name,surname,email);
		this.proffesion = proffesion;

	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}

	

}
