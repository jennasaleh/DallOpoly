package main;

//import com.sun.prism.paint.Color;

public class Player {
	//private static final int DEFAULT_START_VALUE = 2000;
	//debug test
	private static final int DEFAULT_START_VALUE = 2000;

	private String color;

	private String name;

	private int playerId = -1;

	protected int money;

	private int position;

	private Die die;

	public Player(String n,int i,String colorIn) {
		color = colorIn;
		playerId = i;
		name = n;
		money = DEFAULT_START_VALUE;
		position = 0;
		try {
			die = new Die();
		} catch(TooFewDieFacesException e) {
			System.out.println(e.getLocalizedMessage());
		}


		System.out.println(name + " created.");
	}

	public String getColor() {
		return color;
	}

	// jenna
	public void charge(int m, Player to) {
		money -= m;
		to.pay(m);
	}

	// jenna
	public void pay(int m) {
		money = money + m;
		System.out.println(" Player " + name + " was paid $" + m + " - new balance $" + money);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return playerId;
	}

	public int getNetworth() {
		return money;
	}

	public int getPosition() {
		return position;
	}

	public void takeTurn() {
		int roll = die.roll();
		position = (position + roll) % 40; 

		System.out.println(name + " rolled a " + roll + " and is at position " + position);
	}

	public boolean playerIsBankrupt() {
		if (getNetworth() < 0)
		{
			//System.out.println("Player " + playerId + " is Bankrupt");
			return true;
		}else
		{
			return false;
		}



	}

}
