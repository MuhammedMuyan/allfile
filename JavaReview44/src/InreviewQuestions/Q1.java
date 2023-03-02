package InreviewQuestions;

public class Q1 {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?


		int a = 5;
		int b = 10;
		
		a = a + b ; // 15
		b = a - b ; // 5
		a = a - b ;
		
		System.out.println("a: " + a );
		System.out.println("b: " + b);
		
		System.out.println("=========================");
		// 2.way
		// using a temporary variable
				// int temp = b;
				// b = a;
				// a = temp;
				// System.out.println("a=" + a + " b=" + b)
		
		// string tarzinda 
		
	/*	String str1 = "Java";
		String str2 = "Selenium";

		System.out.println("str1=" + str1 + " str2=" + str2);

		str1 = str1 + str2; // str1=JavaSelenium
		System.out.println("str1=" + str1 + " str2=" + str2);



		str2 = str1.substring(0, str1.length() - str2.length()); // str2=Java
		System.out.println("str1=" + str1 + " str2=" + str2);

		str1 = str1.substring(str2.length()); // str1=Selenium
		System.out.println("str1=" + str1 + " str2=" + str2);
		*/
		
		
		System.out.println("====================");
		
		
		
		String s1 = "mus";
		String s2 = "manisa";
		
		
		s1 = s1 + s2; // s1=musmanisa
		System.out.println(s1); 
		
		s2 = s1.substring(0, s1.length() -s2.length()); // s2= mus
		System.out.println(s2);
		
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
	}


}
