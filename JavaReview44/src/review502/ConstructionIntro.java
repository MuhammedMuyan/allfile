package review502;

public class ConstructionIntro {

	String name;
	int age;
	
	
	ConstructionIntro() {
		System.out.println("I am a default construction");
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructionIntro con = new ConstructionIntro();
		
		con.name = "Sabah";
		con.age =45;
		System.out.println(con.name + " " + con.age);
		
		
		

	}

}
