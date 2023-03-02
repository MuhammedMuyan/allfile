package Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	
	
	
	System.out.println("Tuta giriniz: ");	
	double price = input.nextDouble();
	
	System.out.println("Kart numarasi giriniz: ");
	String cardNumber = input.next();
	
	
	System.out.println("Son kullanma tarihi giriniz: ");
	String date = input.nextLine();
	
	
	System.out.println("Guvenlik kodu giriniz: ");
	String cvc = input.next();
	
	
	System.out.println("1. A bankasi");
	System.out.println("2. B bankasi");
	System.out.println("3. C bankasi");
	System.out.println("Banka seciniz: ");
	
	int selectBank =input.nextInt();
	
	
	switch (selectBank) {
	case 1:
		ABankasi aPos =new ABankasi("A bankasi","12121212","89889889");
		aPos.connect();
		aPos.payment(222, "8989", "000", "4254");
		
		
		
		break;
		default:
			
			System.out.println("Gecerli banka giriniz: ");
	
	}
	
	
	
	
	
	
	

	}

}
