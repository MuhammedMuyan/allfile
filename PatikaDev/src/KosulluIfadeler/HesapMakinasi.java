package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {
		
	
		
		int n1,n2,select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ilk sayinizi giriniz: ");
		n1 = input.nextInt();
		System.out.println("Ikinci sayibizi giriniz: ");
		n2 = input.nextInt();
		
		
		System.out.println("1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme");
		System.out.println("Seciminiz");
		select = input.nextInt();
		
		
		if (select == 1) {
			System.out.println(n1 + n2);
		}
		else if (select == 2) {
			System.out.println(n1 - n2);
		}
		else if (select == 3) {
			System.out.println(n1 * n2);
		}
		else if (select == 4) {
			System.out.println(n1 / n2);
		      
			if ( n2 !=0) {
			System.out.println("n1 / n2");
		}
		    else {
			System.out.println("Bir sai 0 a bolunemez");
		    }
			}
		
		
		else {
			System.out.println("Gecersiz sayi");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
