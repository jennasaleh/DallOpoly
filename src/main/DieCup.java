package main;

public class DieCup {
	public final static int MIN_TOTAL = 2;
	public final static int MAX_TOTAL = 12;

	private Die die;

	public DieCup() {
		try {
			Die die = new Die();
		} catch (TooFewDieFacesException e) {
			e.printStackTrace();
		}
	}

	public int rollTwo() {
		int dice1 = die.roll();
		int dice2 = die.roll();
		int total = dice1 + dice2;
		return total;
	}

}