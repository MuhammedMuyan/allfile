package Interface;

public class BBankasi {

	private String bankaAdi;
	private String terminalId;
	private String password;
	public BBankasi(String bankaAdi, String terminalId, String password) {
		super();
		this.bankaAdi = bankaAdi;
		this.terminalId = terminalId;
		this.password = password;
	}
	
	
	public void conn(String str) {
		System.out.println(this.bankaAdi + " bglanildi.");
	}
	
	public void sendPayment(double price) {
		System.out.println("Bankadan islem bekleniyor.");
		System.out.println("Islem basarili oldu.");
	}
	
	
	
	
	
	
	
	
	public String getBankaAdi() {
		return bankaAdi;
	}
	public void setBankaAdi(String bankaAdi) {
		this.bankaAdi = bankaAdi;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
