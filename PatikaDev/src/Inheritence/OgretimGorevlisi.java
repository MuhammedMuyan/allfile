package Inheritence;

public class OgretimGorevlisi extends Akademisyen{

	private String kapiNo;
	
	public OgretimGorevlisi(String name, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
		
		super(name, telefon, eposta, bolum, unvan);
		
		this.kapiNo = kapiNo;
		
		
	}
	
	
	public String getKapiNo() {
		return this.kapiNo;
	}
	
	public void setKapiNo(String kapiNo) {
		this.kapiNo = kapiNo;
	}
	
	@Override
	public void giris() {
		System.out.println(this.getName() + " ogretim gorevlisi B kapisindan giris yapti!");
	}
	
}
