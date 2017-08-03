//Stephan Scott

import java.util.Scanner;

public class RockPaperScissorsScott {
	public static void main(String[] args) {
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println("Player 1 please choose Rock, Paper, or Scissors.");
		String p1 = playerInput.next();
		p1 = p1.toUpperCase();

		
		System.out.println("Player 2 please choose Rock, Paper, or Scissors.");
		String p2 = playerInput.next();
		p2 = p2.toUpperCase();

		
		
		if (p1.equals("ROCK")) {
			if (p2.equals("PAPER")) {
				System.out.println("Player 2 Wins!");

			} else if (p2.equals("SCISSORS")) {
				System.out.println("Player 1 Wins!");

			} else {
				System.out.println("It's a tie!");
			}

		} else if (p1.equals("PAPER")) {
			if (p2.equals("SCISSORS")) {
				System.out.println("Player 2 Wins!");

			} else if (p2.equals("ROCK")) {
				System.out.println("Player 1 Wins!");

			} else {
				System.out.println("It's a Draw!");

			}
		} else if (p1.equals("SCISSORS")) {
			if (p2.equals("ROCK")) {
				System.out.println("Player 2 Wins!");

			} else if (p2.equals("PAPER")) {
				System.out.println("Player 1 Wins!");

			} else {
				System.out.println("It's a Draw!");

			}
		}

		playerInput.close();

		
	}
}