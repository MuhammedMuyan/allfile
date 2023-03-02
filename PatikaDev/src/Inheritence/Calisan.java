package Inheritence;

public class Calisan {

	private String name;
	private String telefon;
	private String eposta;
	
	public Calisan(String name, String telefon, String eposta) {
		
		this.name = name;
		this.telefon = telefon;
		this.eposta = eposta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	public void giris(String girisSaati, String cikisSaati) {
		System.out.println(this.getName() + " " + girisSaati + " saatinde universiteye giris yapti." + cikisSaati + " saatinde cikis yapti.");
	}
	
	
	public void giris() {
		System.out.println(this.getName() + " Universiteye giris yapti.");
	}
	
	public void cikis() {
		System.out.println(this.getName() + " Universiteye cikis yapti.");
	}
	
	public void yemekhane() {
		System.out.println(this.getName() + " Yemkehaneye giris yapildi.");
	}
	
	
	
	
	
}
