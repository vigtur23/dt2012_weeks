/*
Sten-Sax-Paase:

The user inputs Rock, Scissors or Bag.
The program randomly chooses one of these:
   suggestion: use 0 for Rock, 1 for Scissors and 2 for Bag.

The program outputs what the user says, what the program says
and who wins:
    either "You win!" if the user wins
    or     "I win!" if  the program wins
    or     "We are even!" if both picked the same object.

To decide what to do depending on the user input use a switch statement on
the string userSays. There are three interesting cases:
    "Rock", "Scissors" and "Bag"
    */

import java.lang.Math;

public class E3{

	public static void main(String[] args) {
		String userSays = args[0];
		int    programSays = (int)((Math.random()*3));
		String message = "I don't know";
		int result = 0; // 0 = lose, 1 = draw, 2 = win

		String decoded = "";
		switch (programSays){
			case 0:
				decoded = "Rock";
				if (userSays.equals("Bag"))
					result = 2;
				break;
			case 1:
				decoded = "Scissors";
				if (userSays.equals("Rock"))
					result = 2;
				break;
			case 2:
				decoded = "Bag";
				if (userSays.equals("Scissors"))
					result = 2;
				break;
		}
		// Check if user and program chose the same string, in that case there is a draw
		result = (decoded.equals(userSays) ? 1 : result);
		switch (result)
		{
			case 0:
				message = "I win!";
				break;
			case 1:
				message = "We are even!";
				break;
			case 2:
				message = "You win!";
				break;
		}
		System.out.println("You say " + userSays);
		System.out.println("I say "   + decoded);
		System.out.println(message);
	}
}
