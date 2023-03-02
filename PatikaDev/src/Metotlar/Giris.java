package Metotlar;

public class Giris {

	
	static void helloworld() {
		System.out.println("Merhaba Dunya!");
	}
	
	
	static int power(int base, int exp) {
		
		int result = 1;
		for(int i=1; i<=exp; i++) {
			result*=base;
		}
		
		return result ;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		// 1. yontem
		int case1 = power(4,3);
		
		System.out.println(case1);
		
		System.out.println("========================================");
		
		//2. yontem
		System.out.println(power(2,3));
		
		
		// yukardan direk asagiya artiriyor!
		
		
		
		// metotlar siniflar arasina yazilir
		
		
		System.out.println("------------------------------------------");
		
		helloworld();
		
		
	}

}
