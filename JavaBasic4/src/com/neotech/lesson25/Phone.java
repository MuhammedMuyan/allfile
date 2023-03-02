package com.neotech.lesson25;

public abstract class Phone {

	
	
	public void call() {
		System.out.println("Phone can make calls!");
	}
	
	public void text() {
		System.out.println("Phones can send texts!");
	}
	
	public abstract void takePicture();
	
	public abstract void playMusic();
	
	

	
}

class iphone extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Phone can take good pictures!");
		
	}

	@Override
	public void playMusic() {
		
		System.out.println("Phones can lay music!");
	}
	
	@Override
	public void call() {
		System.out.println("iphone also makes Facetime music!");
	}
	
}


class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes bad pictures!");
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play simple music!");
	}
	
	public void googlePlay() {
		System.out.println("Samsung has a google play!");
	}


}
