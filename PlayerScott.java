//Stephan Scott
public class PlayerScott {
	
	private int playerNum;
	private String playerName;
	private String position;
	
	public PlayerScott() {
		
	}
	
	public PlayerScott(int playerNaum, String playerName, String position){
		this.playerNum = playerNum;
		this.playerName = playerName;
		this.position = position;	
	}
	
	
	public int getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "PlayerScott [playerNum=" + playerNum + ", playerName=" + playerName + ", position=" + position + "]";
	}

}

/*   
Include a new field in the BaseballPlayer class for 
batting average.  Include a new field in the BasketballPlayer class for free-throw
percentage.  Override the Player class methods that set and output the data so 
that you accommodate the new fields.

Create a toString method for each subclass to repeat the player number, name and 
position from the super class and the additional information for each class.

Finally create a PlayerTesterYourLastName class that instantiates two objects of 
each type, populate the instance variables (using the appropriate method) and 
finally repeat the information about the players using the toString method.*/