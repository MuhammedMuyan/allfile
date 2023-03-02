package review5;

public class School {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "Kenan";
		student1.studentNr = 358;
		student1.gradeLevel = 10;
		
		
		
		
		Teacher teacher = new Teacher();
		teacher.name = "Sabah";
		teacher.salary = 150000;
		teacher.subject = "Java";
		
		student1.study();
		
		teacher.yellAtStudent();
		
		
		
		
		
	}

}
