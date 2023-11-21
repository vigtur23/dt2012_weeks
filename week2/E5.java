/*

The program prints the first (positive) odd numbers smaller or equal
than the bound.
The bound is given as a command line argument.
The bound can be any non-negative number.

*/

public class E5{
	public static void main(String[] args) {
		int bound = Integer.parseInt(args[0]);
		System.out.println("The positive odd numbers smaller or equal than "
				+ bound
				+ " are:");
		for (int i = bound; i > 0; i--)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
