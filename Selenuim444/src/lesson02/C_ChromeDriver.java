package lesson02;

public class C_ChromeDriver implements I_WebDriver {

	
	public C_ChromeDriver() {
		System.out.println("Opening Chrome Browser");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("Chrome Landing on " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome gets the title of page");
		return "Page Title";
	}

	@Override
	public String getCurrenUrl() {
		System.out.println("Chrome gets current url");

		return "Page Url";
	}

	@Override
	public void close() {
		System.out.println("");
	}

	@Override
	public void quit() {
		System.out.println("Chrome closing the current tab");
	}

}
