package com.neotech.lesson23;

public class UserClass {

	String name;
	long mobileNumber;
	
	UserClass() {
		
	}
	
	UserClass(String name, long mobileNumber ) {
		
		this.name =name;
		this.mobileNumber = mobileNumber;
	}
	
	
	
}



	class UserInfo extends UserClass {
		
		String userAddress;
		
		UserInfo(String name,  long mobileNumber, String userAddress){
			super(name, mobileNumber);
			this.userAddress = userAddress;
		}
		
		void userDetails() {
			System.out.println("User Details: ");
			System.out.println("Name -> " + name);
			System.out.println("Mobile -> " + super.mobileNumber);
			System.out.println("Address -> " + userAddress);
		}
		
		
		
		
		
		
	}