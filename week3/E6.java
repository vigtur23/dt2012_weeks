/*
The program uses standard input to read
  two integers N and M
and
  N x M integers between 1 and 6.
(This is how the output of exercise E1 looks like:
    N was the number of trials and 
    M was the number of dices used in each trial.
)

The program prints the sum of dices in a trial that occurrs more often
and how often it occurs.

Example:
java E6
5 3
1 2 3
2 3 4
4 3 2
3 4 5
5 6 6
The most frequent sum is 9
It occurrs 2 times.

Example using the output of E1 as standard input:
java E1 1000 3 | java E6
The most frequent sum is 9
It occurrs 128 times.

*/

/*
Your task is to complete the program.

Hint: Use an array where the indices are the possible sums
that can be achieved in a trial.
For example, if the simulation uses 3 dices the sum of the
three dices can be at most 18. For this case the program
can use an array with 19 places so that even place 18 exists.
In each place you can count how many times that value (the place)
occurs in the sequence of trials.

*/


import java.util.Scanner;
public class E6{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int trails = stdin.nextInt();
		int dices  = stdin.nextInt();

		int[] sa = new int[(dices * 6) + 1]; // sum array
		int sum = 0;
		int dc = 0; // dice count

		for (int i = 0; i < trails*dices; i++)
		{
			sum += stdin.nextInt();
			dc++;
			if (dc >= dices)
			{
				dc = 0;
				sa[sum]++;
				sum = 0;
			}
		}

		int idx = 0;
		boolean mm = false; // multiple max sums found
		for (int i = 0; i < (dices * 6) + 1; i++)
		{
			if (sa[i] > sa[idx])
			{
				idx = i;
				mm = false;
			}
			else if (sa[i] == sa[idx])
			{
				mm = true;
			}
		}
		if (mm)
		{
			System.out.println("Multiple most frequent sums found");
			System.out.println("They occurr " + sa[idx] + " times.");
		}
		else
		{
			System.out.println("The most frequent sum is " + idx);
			System.out.println("It occurrs " + sa[idx] + " times.");
		}
	}
}
