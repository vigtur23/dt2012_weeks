/*

Write a program that
 * takes integers M and N from the command line,
 * generates M random permutations of the numbers 0 to N-1,
 * and prints
        - the permutations
        - the number of left-to-right-minima of each permutation
	- the average  of the left-to-right minima

We first explain what left-to-right minima is.
The number of left-to-right minima for a sequence of numbers is a count
of how many times you see a smaller number than the minimum number you have seen until now.

For example, if the permutation of numbers 0 to 9 is
4 8 2 1 9 0 5 3 7 6
then the number of left-to-right minima is 4 because:
First 4 is the smallest element seen so far (the first element is always the smallest element seen so far at the start!),
then 2 is the smallest element seen so far
Then 1 is the smallest element seen so far
Finally 0 is the smallest element seen so far
So 4 is the number of times an element is the smallest seen so far: 4 is the number of left-to-right minima.

Another example, if the permutation of numbers 0 to 9 is
6 9 7 5 0 2 8 4 1 3
then the number of left-to-right minima is 3.
First you see 6, then 5 is smaller and then 0 is smaller.

** Now to the program you have to write.**
In this program you have to generate several permutations (M from the command line)
all for the numbers 0..N-1 (N from the command line)
and you have to print the  permutations, the number left-to-right minima for each permutation
and the average of these values.

Example:
java Bonus 5 10
5 0 2 1 8 4 6 3 9 7 (2)
4 2 3 7 8 6 9 1 0 5 (4)
9 1 8 3 0 7 2 4 6 5 (3)
0 7 2 5 1 9 6 3 4 8 (1)
0 7 6 4 3 8 9 2 5 1 (1)

2.2

The program generated and printed permutation 5 0 2 1 8 4 6 3 9 7
and calculated the number of left-to-right minima 2 (printed in parenthesis after the permutation).
Generated four more permutations, printed them and printed the corresponding number of left-to-right minima in parenthesis.

Finally it calculated and printed the average (2 + 4 + 3 + 1 +1) / 5 that is the 2.2 you see.


*/
/*
  Your task is to complete the program.
*/
public class Bonus{
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int[] permutation = new int[n];

		double av = 0; //average value

		for (int j = 0; j < m; j++)
		{
			// all numbers 0..n-1 in order
			for(int i = 0; i < n; i++){
				permutation[i] = i;
			}
			// shuffle the numbers
			// code from the course book
			for (int i = 0; i < n; i++) {
				int r = (int) (Math.random() * (i+1));     // int between 0 and i
				int swap = permutation[r];
				permutation[r] = permutation[i];
				permutation[i] = swap;
			}
			// the permutation is now in the array permutation!

			int min = n;
			int cnt = 0;
			for (int i = 0; i < n; i++)
			{
				System.out.print(permutation[i] + " ");
				if (permutation[i] < min)
				{
					cnt++;
					min = permutation[i];
				}
				if (i == n-1)
				{
					av += cnt;
					System.out.println("(" + cnt + ")");
				}
			}
		}

		System.out.println("\n" + av/m);
	}
}
