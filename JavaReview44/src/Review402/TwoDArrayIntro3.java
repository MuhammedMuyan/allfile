package Review402;

public class TwoDArrayIntro3 {

	public static void main(String[] args) {
		
		
		int[][] nums = { 
				{ 3, 6 }, 
				{ 5, 2, 9, 7 }, 
				{ 8 }
		};
		
		
		for(int row=0; row<nums.length; row++) {
			
			for(int col=0; col<nums[row].length; col++) {
				
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("========================");
		
		
		
		for( int[] satir : nums) {
			
			for(int hucre : satir) {
				System.out.print(hucre + " ");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
