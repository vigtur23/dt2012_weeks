/*
The program takes an integer number from the command line.

It prints
  the numbers 0 .. n-1
  a permutation of the numbers
  the number of places where the permutation has element i in position i

Example:
java E7 10
0 9
1 8
2 2
3 5
4 0
5 1
6 3
7 7
8 4
9 6
2 elements are in place

As you can see, element 2 and 7 are in the same place as in the
sequence 0 .. 9.

*/

/*
Your task is to complete the program after
// Your code here

The code you get already calculates the permutation.

*/

public class E7{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] permutation = new int[n];

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

		int cnt = 0;
		for (int i = 0; i < n; i++)
		{
			System.out.println(i + " " + permutation[i]);
			if (i == permutation[i])
			{
				cnt++;
			}
		}
		System.out.println(cnt + " elements are in place");
	}
}
