package main;

public class Tile {
	
	private int ownedBy = -1;
	
	private int costToBuy = -1;

	public Tile(int i) {
		costToBuy = i;
	}
	
	public void action() {
		
	}
	
	public void buy(int playserIndex, int playerNetworth) {
		if(ownedBy == -1 && playerNetworth > costToBuy)
			ownedBy = playserIndex;
		else
			System.out.println("Can't buy!");
	}

}
