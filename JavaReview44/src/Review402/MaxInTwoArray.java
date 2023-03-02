package Review402;

public class MaxInTwoArray {

	public static void main(String[] args) {

		// Task: Find the biggest number in a 2D Array
		int[][] b = { { -2, 3, 5 }, 
					{ 2, 4, 7 }, 
					{ 8, 1, -9 }, 
					{ 3, 5, 1 } 
				};

		
		int max = b[0][0];
		
		for(int[] satir : b) {
			
			for(int hucre : satir) {
				
				
				if(hucre > max) {
					max=hucre;
					
				}
			}
		}
				System.out.println(max);
				
		
		
		System.out.println("+=====================");
		
		
		int largest = b[0][0];
		
		for(int row=0; row<b.length; row++) {
			
			for(int col=0; col<b[row].length; col++) {
				int element = b[row][col];
				
				if(element>largest) {
					largest=element;
				}
			
			}
		
		}
		System.out.println(largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
