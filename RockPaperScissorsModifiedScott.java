import java.util.Scanner;
//Stephan Scott

public class RockPaperScissorsModifiedScott {

	public static void main(String[] args) {
		Scanner playerInput = new Scanner(System.in);

		System.out.print("Player 1 please choose Rock, Paper, or Scissors.");
		String p1 = playerInput.next();
		p1 = p1.toUpperCase();

		System.out.print("Player 2 please choose Rock, Paper, or Scissors.");
		String p2 = playerInput.next();
		p2 = p2.toUpperCase();

		switch (p1) {
		case "PAPER":
			switch (p2) {
			case "ROCK":
				System.out.print("Player 1 Wins!");
				break;
			case "SCISSORS":
				System.out.print("Player 2 Wins!");
				break;
			case "PAPER":
				System.out.print("It's a Draw!");
				break;
			default:
				//default set.
			}
		}

		switch (p1) {
		case "ROCK":
			switch (p2) {
			case "SCISSORS":
				System.out.println("Player 1 Wins!");
				break;
			case "PAPER":
				System.out.println("Player 2 Wins!");
				break;
			case "ROCK":
				System.out.println("It's a Draw!");
				break;
			default:
				//default set.
			}
		}
		switch (p1) {
		case "SCISSORS":
			switch (p2) {
			case "PAPER":
				System.out.println("Player 1 Wins!");
				break;
			case "ROCK":
				System.out.println("Player 2 Wins!");
				break;
			case ("SCISSORS"):
				System.out.println("It's a Draw!");
				break;
			}
		}

	}

}