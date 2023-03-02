package com.neotech.lesson02;

public class C_ChromeDriver implements I_WebDriver {

	
	public C_ChromeDriver() {
		System.out.println("opening Chrome Browser");
	}
	
	
	
	@Override
	public void get(String url) {
		System.out.println("Chrome navigating to " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome gets title of the page");
		return "Page Title";
	}

	@Override
	public String getCurrenturl() {
		System.out.println("Chrome gets the current url");
		return "Page Url";
	}

	@Override
	public void close() {
		System.out.println("Chrome closing the current page,tabe");
		
	}

	@Override
	public void quit() {
		System.out.println("Chrome closing all the pages,tabes");
		
	}

}
