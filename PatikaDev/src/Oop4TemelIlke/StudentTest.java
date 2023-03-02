package Oop4TemelIlke;

public class StudentTest {

	public static void main(String[] args) {
		

		Student st1 = new Student("Mustafa","Cetindag", "123", "AA", 50 );
		Student st2 = new Student("Patika", "Dev", "2321", "BB", 90  );
		
		
		st2.setNote(100);
		
		System.out.println(st2.getNote());
		
		
		
		Course mat = new Course("Mat101", "MAT");
		Student[] stu = {st1, st2};
		
		
		System.out.println("Ortalama : " + mat.calcAvarage(stu) );
		
	}

}