package kodlamioInheritanceOdev;

public class Main {

	public static void main(String[] args) {
		InstructorUser instructorUser = new InstructorUser();
		instructorUser.setId(1);
		instructorUser.setFirstName("Furkan");
		instructorUser.setLastName("Sertkyalı");
		instructorUser.seteMail("Öğretmen emaili");
		instructorUser.setVerdigiKurs("Java Kursu Veriyor");

		StudentUser studentUser = new StudentUser();
		studentUser.setId(2);
		studentUser.setFirstName("Ahmet");
		studentUser.setLastName("Mehmet");
		studentUser.seteMail("Öğrenci Emaili");
		studentUser.setAldigiKurs("Java Kursu Alıyor");

		Course course = new Course();
		course.setId(1);
		course.setCourseName("Java");
		course.setInstructorName("Furkan");
		CourseManager courseManager = new CourseManager();
		courseManager.add(course);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.open(instructorUser);
		StudentManager studentManager = new StudentManager();
		studentManager.join(studentUser);

	}

}
