package Inheritence;

public class Patika {

	public static void main (String[] arg) {
		
		
		Calisan c1 = new Calisan("Mustafa", "9389483984", "info@dev.patika");
		
		Akademisyen a1 = new Akademisyen ("Patika", "783748738", "bilgi@hotmail.com", "Cenk", "Docent");
		
		//a1.derseGir();
		
		
		
		Memur m1 = new Memur ("Ali", "384938493","patika@hotmail.com", "bilgi islem" , "9-10");
		
		//m1.calis();
		
		
		OgretimGorevlisi o1 = new OgretimGorevlisi("AAA", "38593859", "gmail@hiajdi", "edebiyat", "prof", "49");
		
		//o1.giris("10:00", " 17:00");
		
	
	// method over riding metod ezme islemi en yakin siniftan referans alir.
		o1.giris();
	
	
	
	
	
	
	
	
	
	
	}
	
}
