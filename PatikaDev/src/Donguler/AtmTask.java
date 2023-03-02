package Donguler;

import java.util.Scanner;

public class AtmTask {

	public static void main(String[] args) {
		
		
		
		String username, password;
		Scanner scan = new Scanner(System.in);
		int right = 3;
		int balance = 150;
		int select ;
		
		
		while(right > 0) {
			
		
			
			System.out.print("What is your name: ");
			username = scan.next();
			
			System.out.print("Enter your password: ");
			password = scan.next();
			
			
			if (username.equals("p") && password.equals("1")) {
				
				System.out.println("Welcome!");
				
				do {
					
					
					System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
					System.out.println("1-Para yatirma\n" + 
									   "2-Para cekme\n" + 
							           "3-Bakiye sorgulama\n" +
					                   "4-Cikis");
					System.out.print("Enter number: ");
					select = scan.nextInt();
					
					if(select == 1) {
						System.out.print("Para miktari: ");
						int price = scan.nextInt();
						balance+=price;
					
					 
					}else if(select == 2) {
						System.out.print("Para miktari: ");
						int price = scan.nextInt();
						
						if(price > balance) {
							System.out.print("Bakiye yetersiz!");
						
							
						}else {
								balance -= price;
						
						}
						
					
					}else if(select == 3) {
						System.out.print("Bakiyeniz " + balance);
					}
				
					
				}while(select != 4);
				
				System.out.println("Tekrar gorusmek uzere!");
				break;
				
				
			}
			else {
				System.out.println("Wrong name or password!");
				System.out.println("kalan hakkiniz: " + --right );
				
			if (right == 0) {
				System.out.println("Your account has been blocked, please contact with your bank!");
			}
			
			}
		
		
		
		}
		
		
		
		
		
		
		
		
		

	}

}
