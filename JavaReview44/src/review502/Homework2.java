 package review502;

public class Homework2 {

	public static void main(String[] args) {
		
		
		String str = "Hello123457889+-0All";
		
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(str2);
		
		
		// what if we want to find out how many numbers are there?
		
		System.out.println(str.replaceAll("[^0-9]", "").length());

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
