package Inheritence;

public class Memur extends Calisan {

	private String departmen;
	private String mesai;
	
	public Memur(String name, String telefon, String eposta, String departmen, String mesai) {
		super(name, telefon, eposta);
		this.departmen = departmen;
		this.mesai = mesai;
	}
	
	
	public String getDepartmen() {
		return this.departmen;
	}
	
	public void setDepartmen(String departmen) {
		this.departmen = departmen;
	}
	
	
	public String getMesai() {
		return this.mesai;
	}
	
	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
	
	
	public void calis() {
		System.out.println(this.getName() + " memur gorevini yapiyor.");
	}
	
	
	
	
}
