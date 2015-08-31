package main;

public class Player {
	private String name;
	
	private double money;
	
	private int position;

	private Die die;
	
	public Player(String n) {
		name = n;
		die = new Die();
		
		System.out.println(name + " created.");
	}
	
	public void takeTurn() {
		System.out.println(name + " rolled a " + die.roll());
	}

}
