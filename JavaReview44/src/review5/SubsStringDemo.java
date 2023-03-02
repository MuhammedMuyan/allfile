package review5;

public class SubsStringDemo {

	public static void main(String[] args) {
		
		
		String longStr = "I am very happy today because it is Monday.";
		
		String anotherStr = longStr.substring(5,7);
		System.out.println(anotherStr);
		
		
		
		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);
		
		
		System.out.println("longStr -> " + longStr);
		
		longStr = longStr.substring(10);
		System.out.println("longStr -> " + longStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
