package Review402;

public class TwoDArrayIntro2 {

	public static void main(String[] args) {
		
		
		int[][] nums = { 
				{ 6, 3, 7 }, 
				{ 2, 4, 9 }, 
				{ 1, 5, -4 }, 
				{ 8, 6, 2 } 
			};
		
		
		
		for(int row = 0; row<nums.length; row++) {
			
			for(int col=0; col<nums[row].length; col++) {
				
				System.out.print(nums[row][col] + " ");
			}
		
			System.out.println();
		}
		
		System.out.println("==============================");
		
		
		
		for(int[] r : nums) {
			
			for(int element : r) {
				
				System.out.print(element + " ");
			}
				System.out.println();
		}
		
		
		
		
		
		
		
	}

}
