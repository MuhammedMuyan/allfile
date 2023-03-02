package review3;

public class eachLoop {

	public static void main(String[] args) {
		
		String[] names= {"Anna", "Mike", "John", "saha", "Alex"};
		
		for(String name : names) {
			System.out.println(name + " ");
		}
		
		
		System.out.println("--------------------");
		
		
		int[] num = {3,4,5,1,- 6,8,12};
		int sum = 0;
		
		
		for(int numbers : num) {
			sum+= numbers;
		}
		
		System.out.println(sum);
				
		
		System.out.println("-------------------------");
		
		
		
		
		//loop
		char[]vovel= {'a','b','g','h','t'};
		
		for( int i = 0; i < vovel.length; i++) {
			System.out.println(vovel[i]);
		}
		
		System.out.println("====================");
		
		
		
		//each loop
		
		char[] letter = {'a', 'c', 'f', 'd'};
		
		for(char letters : letter) {
			System.out.println(letters);
		}
		
		
		

	}

}
