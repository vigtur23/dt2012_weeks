/*

The program reads a sequence of integer numbers from standard input
and counts how many times the first element of the sequence occurs
in the sequence.

Example showing how the program should behave.
The sequence of numbers is provided from the keyboard.
Notice how the user  terminates input to the program
using Ctrl D.
The only output is the final message with the count.

java E3
10 1 3 10 2 10
2
3
10
^D
Number 10 occurred 4 times.

*/

/*
Your task is to complete the program after
  // Your code here

Make sure the program works correctly also if the user
only provides one number.

** Optional: **
***************
If the user presses Ctrl D without providing any numbers the program
has nothing to do: there should be no output and the program should
terminate quietly.

 Make sure your program has this behaviour.
*/
import java.util.Scanner;

public class E3{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n;
		if (stdin.hasNextInt())
			n = stdin.nextInt();
		else
			return;

		int cnt = 0;

		while (stdin.hasNextInt())
		{
			if (n == stdin.nextInt())
			{
				cnt++;
			}
		}

		System.out.println("Number " + n + " occured " + cnt + " times.");
	}
}
