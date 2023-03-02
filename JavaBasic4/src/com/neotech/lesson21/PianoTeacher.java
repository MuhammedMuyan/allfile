package com.neotech.lesson21;

public class PianoTeacher extends Teacher {

	boolean ownPiano;
	
	public void playPiano() {
		System.out.println(fullName + " plays piano!");
		System.out.println(fullName + " own a piano!" + ownPiano);
	}
	
	public static void main (String[] arg) {
		
		PianoTeacher pt = new PianoTeacher();
			
		pt.fullName = "FAzil Say";
		pt.major = "Music";
		pt.gender ='M';
		pt.ownPiano = true;
				
		pt.teaches();
		pt.playPiano();
				
				
				
				
				
				
	}
	
	
	
	
}
