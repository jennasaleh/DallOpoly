package main;

public class Tile {
	
	private Player ownedBy = null;
	
	private int costToBuy = -1;
	
	private int tileId = -1;

	public Tile(int cost,int id) {
		System.out.println("Tile created cost: " + cost + " id: " + id);
		costToBuy = cost;
		tileId = id;
	}
	
	public int getCost() {
		return costToBuy;
	}
	
	public Player getOwnedBy() {
		return ownedBy;
	}
	
	public void action() {
		
	}
	
	public void buy(Player p) {
		ownedBy = p;
		
		System.out.println(p.getName() + " bought tile " + tileId + " for " + costToBuy);
	}

}
