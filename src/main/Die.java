package main;

import java.util.Random;

public class Die {

	public Die() {
		// TODO Auto-generated constructor stub
	}
	
	public int roll() {
		Random r = new Random();
		
		return Math.abs(r.nextInt() % 6) + 1;
	}

}

