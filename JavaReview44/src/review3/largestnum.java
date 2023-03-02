package review3;

public class largestnum {

	public static void main(String[] args) {
		
		
		int[] numbers = {10,20,40,14,-14,70,60,90,40};
		
		int largest = numbers[0];
		
		
		for(int i=1; i<numbers.length; i++) {
			
			if(largest < numbers[i]) {
				largest = numbers[i];
				
			}
		
		}
		
		System.out.println(largest);
		
		
		
		
		
		
		
		
		

	}

}
