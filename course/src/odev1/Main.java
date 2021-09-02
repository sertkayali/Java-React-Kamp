package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"yüzde 57", "Java React Kursu", "Engin Demiroğ");
		Course course2 = new Course(2,"yüzde 89", ".Net Core Kursu", "Furkan SERTKAYALI");
		
		Course[] courses = {course1,course2};
		CourseManager courseManager = new CourseManager();
		for(Course course: courses) {
			System.out.println(course.name);
			courseManager.joinCourse(course1);
		}
		
		
		
		
	}

}
