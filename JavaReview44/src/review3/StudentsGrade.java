package review3;

public class StudentsGrade {

	public static void main(String[] args) {
		
		
		String[][] students = {
				{"Ali", "Veli", "Deli", "Zirdeli"},
				{"Pekiyi", "Iyi", "Orta", "Kotu"}
				
		};
		
		for(int i = 0; i<students[1].length; i++) {
			
			if(students[1][i].equals("Pekiyi") || students[1][i].equals("Iyi")) {
				
				System.out.println( students[0][i] + " " + students[1][i]);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
