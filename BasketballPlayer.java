
public class BasketballPlayer extends PlayerScott{
	
	private double freeThrowPercentage;
	
	public BasketballPlayer() {
		
	}

	public BasketballPlayer(int playerNum, String playerName, String position, double freeThrowPercentage){
		super(playerNum, playerName, position);
		this.freeThrowPercentage = freeThrowPercentage;
	}
	
	public double getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	@Override
	public String toString() {
		return "BasketballPlayer [freeThrowPercentage=" + freeThrowPercentage + ", getPlayerNum()=" + getPlayerNum()
				+ ", getPlayerName()=" + getPlayerName() + ", getPosition()=" + getPosition() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
