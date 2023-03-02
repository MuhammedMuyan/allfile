package KosulluIfadeler;

import java.util.Scanner;

public class Sinifigecme {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Mat notunuzu giriniz");
		mat = input.nextInt();
		
		System.out.println("Fizik notunuzu giriniz");
		fizik = input.nextInt();
		
		System.out.println("Turkce notunuzu giriniz");
		turkce = input.nextInt();
		
		System.out.println("Kimya notunuzu giriniz");
		kimya = input.nextInt();
		
		
		System.out.println("Muzik notunuzu giriniz");
	    muzik = input.nextInt();
		
		
	    double avarage = ( mat + fizik + turkce + kimya + muzik) / 5;
	    
	    if ( avarage <= 55) {
	    	System.out.println("Sinifta kaldiniz!");
	    
	   }
	    else {
	    	System.out.println("Tebrikler Gectiniz!");
	    }
		
		
	}

}
