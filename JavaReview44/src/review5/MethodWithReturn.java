package review5;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		String name = "Dardan";
		int numofChars = name.length();
		
		
		System.out.println("The length " + name + " is " + numofChars);
		

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(57);
	
		System.out.println("number 57 is " + res);
		System.out.println("The number is " +  m.isOddEnhanced(97));
	
	}
		
		
		boolean isOdd(int num) {
			
			boolean result;
			
			if(num%2==1) {
				result=true;
			}else {
				result =false;
			}
			return result;
		}
		
		
		boolean isOddEnhanced ( int num) {
			return num % 2 == 1;
		}
		
	

}
