package review5;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String str = "Pershendetje";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
		
		
		boolean equal = str.equals("Pershendetje");
		System.out.println(equal);
		
		System.out.println("=================");
		
		System.out.println(str.contains("m"));
		
		
		System.out.println(str.contains("SH".toLowerCase()));
		
		System.out.println("==========================");
		
		
		
		
		
		String name = "Victor" + "-" +  "Bondar";
		System.out.println(name);
		
		
		String name2 = "Victor".concat("-").concat("Bondar");  //method chainig 
		System.out.println(name2);
		
		String name3 = "Victor".toUpperCase().concat("-").concat("Bondar");
		System.out.println(name3);
		
		System.out.println("victor".length() + 2);
		
		System.out.println("==========================");
		
		
		String str2 = "    Ferdi  Turk      ";
		System.out.println(str2.trim());
		
		System.out.println(str2.trim().length());
		
		
		
		String str3 = "Savas Yasar";
		char letter = str3.charAt(3);
		
		System.out.println(letter);
		
		System.out.println("==========");
		
		System.out.println(str3.indexOf('s'));
		
		
		int indexOfSeconds =str3.indexOf('s',6);
		System.out.println("indexOfSeconds -> " + indexOfSeconds);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
