package reactHomework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student=new Student();
		student.setName("hasan");
		student.setSurname("dgn");
		
		
		Instructor instructor = new Instructor();
		instructor.setName("Atilla");
		instructor.setSurname("Öz");
		
		
		User user = new User();
		user.setName("Anonymous -");
		user.setSurname("1");
		
		
		StudentManager s1 =new StudentManager();
		s1.addStudent(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor(instructor);
		
		UserManager userManager =new UserManager();
		userManager.addUser(user);
		
		s1.addStudent(new Student());
				
	}

}
