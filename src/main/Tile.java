package main;

public class Tile {

	private Player ownedBy = null;

	private int costToBuy = -1;

	private int tileId = -1;

	private int houses = 0;

	private int calculateRent() {
		return (int)(costToBuy * 0.1) * (houses + 1);
	}

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

	public boolean populate(Player p,Bank b) {
		//Available and able to buy
		if((p.getNetworth() >= costToBuy)  && (ownedBy == null)) {
			ownedBy = p;
			System.out.println("	Tile " + tileId + " was purchased by " + p.getName());
			p.charge(costToBuy,b);
			return true;
		} 

		//Not available for purchase
		if(p.getId() != ownedBy.getId()) {
			p.charge(calculateRent(),ownedBy);
			
			//Out of Money?
			//boolean IsBankrupt = p.playerIsBankrupt();
		}

		//Insufficent funds for purchase
		if((ownedBy == null) && (p.getNetworth() < costToBuy)) {
			System.out.println("Insufficent funds to buy");
		}

		return false;
	}

}
