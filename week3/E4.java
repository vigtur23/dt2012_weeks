/*
The program reads a sequence of integers and prints back out
the integers to standard output, except that it excludes repeated
values that appear consecutively.

For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1,
your program should print out 1 2 1 5 1 7 1.

*/

/*

Your task is to complete the program after
 // Your code here

 ** Optional: **
 ***************
 If the user presses Ctrl D without providing any numbers the program
 has nothing to do: there should be no output and the program should
 terminate quitely.

  Make sure your program has this behaviour.
*/
import java.util.Scanner;
public class E4{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int lasti = 0;
		boolean nl = true;

		while (stdin.hasNextInt())
		{
			int i = stdin.nextInt();
			if (nl || i != lasti)
			{
				System.out.print(i + (stdin.hasNextInt() ? " " : ""));
				lasti = i;
				nl = false;
			}
		}
	}
}
