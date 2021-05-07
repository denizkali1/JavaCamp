
public class CourseManager {
	public CourseManager() {
		
	}
	
	void listCourseDetails(Courses course) {
		System.out.println("Course Name: " + course.name);
		System.out.println("Course Details: " + course.detail);
		System.out.println("Course Instructor: " + course.instructor);
		
	}
	
	void registerCourse(Courses course) {
		System.out.println("Registration succeed: " + course.name);
	}
	
}
