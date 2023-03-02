package com.neotech.lesson02;

public interface I_WebDriver {

	public void get(String url);
	
	public String getTitle();
	
	public String getCurrenturl();
	
	public void close();
	
	public void quit();
	
}
