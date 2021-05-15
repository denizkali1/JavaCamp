
public class Main {

	public static void main(String[] args) {
				Courses course1 = new Courses(1, "C#/Angular Camp", "Software development", "Engin Demiroğ");
				Courses course2 = new Courses(2, "Java/React Camp", "Software development", "Engin Demiroğ");
				Courses course3 = new Courses(3, "Introduction to Programming", "Software", "Engin Demiroğ");
				
				Category category = new Category(1, "Software Development");
				System.out.println("Category: "+category.name);
				
				Courses[] courses = { course1, course2, course3 };
				
				CourseManager courseManager = new CourseManager();
				
				
				System.out.println("\n--- Courses ---\n");
				for (Courses course : courses) {
					courseManager.listCourseDetails(course);
					System.out.println();
				}

				
				System.out.println("\n--- Course Registration ---\n");
				
				courseManager.registerCourse(course1);
				
			

	}

}
