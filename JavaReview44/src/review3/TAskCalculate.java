package review3;

public class TAskCalculate {

	public static void main(String[] args) {
		
		
		int[] num = { 2,3,4,5,6,1,8,9,-12,23};
		int sum = 0;
		
		
		for(int number : num) {
			
			sum+=number;
		}
		
		System.out.println(sum);
		
		
		System.out.println("--------------------");
		
	
		
		int[] sayi = {2,3,4,5,6,7,8,20};
		int sonuc = 0;
		
		for(int toplam = 0; toplam<sayi.length; toplam++) {
			
			sonuc+=sayi[toplam];
			
		}
		
		System.out.println(sonuc);
		
		
		
		
		

	}

}
