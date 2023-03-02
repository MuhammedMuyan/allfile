package Polymorphism;


public abstract class Akademisyen extends Calisan {

	private String bolum;
	private String unvan;
	
	
	


	public Akademisyen(String name, String telefon, String eposta, String bolum, String unvan) {
		
		super(name, telefon, eposta);	
		this.bolum = bolum;
		this.unvan = unvan;
	
	}


	public String getBolum() {
		return bolum;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}


	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	
	/*public  void derseGir() {
		System.out.println(this.getName() + " derse giris yapti.");
	} */
	
	//abstract yapicaz yukardaki void dersi
	
	public abstract void derseGir(String dersSaati);
	
	
	
	@Override
	public void giris() {
		System.out.println(this.getName() + " akademisyen A kapisindan giris yapti.");
	}
	
	
	
}
