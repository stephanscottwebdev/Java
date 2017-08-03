
public class BaseballPlayer extends PlayerScott{
	
	private double battingAverage;
	
	public BaseballPlayer() {
		
	}
	
	public BaseballPlayer(int playerNum, String playerName, String position, double battingAverage){
		super(playerNum, playerName, position);
		this.battingAverage = battingAverage;
	}

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}

	@Override
	public String toString() {
		return "BaseballPlayer [battingAverage=" + battingAverage + ", getPlayerNum()=" + getPlayerNum()
				+ ", getPlayerName()=" + getPlayerName() + ", getPosition()=" + getPosition() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
