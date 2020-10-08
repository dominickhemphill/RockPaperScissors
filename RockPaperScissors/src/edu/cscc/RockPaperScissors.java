package edu.cscc;

import java.util.Scanner;

public class RockPaperScissors {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String h_pick;
		String c_pick;
		String ROCK = "rock";
		String PAPER = "paper";
		String SCISSORS = "scissors";

		System.out.println("Let's play rock, paper, scissors");
		System.out.print("Enter your choice: ");
		h_pick = input.nextLine();
		if (ROCK.equalsIgnoreCase(h_pick) || PAPER.equalsIgnoreCase(h_pick) || SCISSORS.equalsIgnoreCase(h_pick)) {

			int rand = (int) (Math.random() * 3 + 1);
			if (rand == 1) {
				c_pick = ROCK;
			} else if (rand == 2)
				c_pick = PAPER;
			else {
				c_pick = SCISSORS;
			}
			System.out.print("Computer picked " + c_pick + "  ");

			h_pick = h_pick.toLowerCase();
			if (c_pick.equals(h_pick)) {
				System.out.println("Tie!");
			} else if ((ROCK.equals(c_pick) && SCISSORS.equals(h_pick)) || (PAPER.equals(c_pick) && ROCK.equals(h_pick))
					|| (SCISSORS.equals(c_pick) && PAPER.equals(h_pick))) {
				System.out.println("Computer wins!");
			} else {
				System.out.println("You win!");
			}

		} else {
			System.out.println(h_pick + " is not a valid choice");
		}
	}

}
