package review5;

public class Methods {

	void sayWelcome( ) {
		for(int i=0; i<=5; i++) {
			System.out.print("Welcome ");
		}
	System.out.println();
	}
	
	
	void sayWelcomeWithNumber (int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for(int i=1; i<=5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	void sayGreetingWithumber(String greeting, int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(7);
		m.sayGreeting("Private");
		
		m.sayGreetingWithumber("Gorusuruz", 2);
		
		
		
		
		
		
		
		

	}

}
