package lesson02;

public class TestWebDriver {

	public static void main(String[] args) {
	
	I_WebDriver driver = new C_ChromeDriver();
	
	driver.get("https://neotechacademy.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
	
	}
	
	
}
