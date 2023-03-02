package review502;

public class StringSplit {

	
		
		
		private static String getVowels(String str) {
			
			String result =str.replaceAll("[^aeiouAEIOU]", " ");
		
			return result;
		}
		
		
		
		
		
		
		
		
		public static void main(String[] args) {	

	
		
		System.out.println(getVowels("Good Moorning"));
			
			
		
		
		
		}

}
