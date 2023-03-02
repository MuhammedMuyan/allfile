package review3;

public class RetrievValuedarray {

	public static void main(String[] args) {
		
		
		String [][] months = {
				{"December", "January", "February"},
				{ "March", "April", "May" },
				{ "June", "July", "August" },
				{ "September", "October", "November"} 
		};
		
			int rows = months.length;
			int columns = months[2].length;
		
		System.out.println(rows + columns);
		
		
		
		for(int row = 0; row < rows; row++) {
			
			for(int col = 0; col<months[row].length; col++) {
				System.out.print(months[row][col] + " ");
				
			}
		
		System.out.println();
		
		
		}
		
		
		
		
		
		

	}

}
