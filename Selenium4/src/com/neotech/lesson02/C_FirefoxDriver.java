package com.neotech.lesson02;

public class C_FirefoxDriver implements I_WebDriver {

	
	public C_FirefoxDriver() {
		System.out.println("Opening Firefox Browser");
	}
	
	
	
	@Override
	public void get(String url) {
		System.out.println("Firefox navigating to " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox gets title of the page");
		return "Page Title";
	}

	@Override
	public String getCurrenturl() {
		System.out.println("Firefox gets the current url");
		return "Page Url";
	}

	@Override
	public void close() {
		System.out.println("Firefox closing the current page,tabe");
		
	}

	@Override
	public void quit() {
		System.out.println("Firefox closing all the pages,tabes");
		
	}

}
