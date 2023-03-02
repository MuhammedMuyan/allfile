package Interface;

public class ABankasi {

	private String bankaAdi;
	private String terminalId;
	private String password;
	
	ABankasi(String bankaAdi, String terminalId, String password) {
		this.bankaAdi = bankaAdi;
		this.terminalId = terminalId;
		this.password = password;
		
	}
	
	public void connect() {
		System.out.println(this.bankaAdi + " bglanildi.");
	}
	
	public void payment(double price, String cardNumber, String expiryDate, String cvc) {
		System.out.println("Bankadan islem bekleniyor.");
		System.out.println("Islem basarili oldu.");
	}
	
	
	
	public String getBankaAdi() {
		return this.bankaAdi;
	}
	public void setBankaAdi(String bankaAdi) {
		this.bankaAdi = bankaAdi;
	}
	
	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
}
