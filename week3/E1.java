/*
The program reads two integer numbers from the command line:
  the number of trials and
  the number of dices
and writes to standard output
  the number of trials and
  the number of dices
and
  the results of simulating throwing all the dices
  for the number of trials.

Example:
java E1 5 3
5
3
5 1 2
2 2 4
3 6 6
5 6 2
3 6 2

*/

/*
Your task is

1) to add code after
  // your code here
to complete the program.

and
2) Use the program for 1000 trials and 3 dices and send the output
to a file as follows:
    java E1 1000 3 > three_dices
*/

public class E1{
	public static void main(String[] args) {
		int trials = Integer.parseInt(args[0]);
		int dices  = Integer.parseInt(args[1]);
		System.out.println(trials);
		System.out.println(dices);

		for (int i = 0; i < trials; i++)
		{
			if (i > 0)
			{
				System.out.println("");
			}
			for (int j = 0; j < dices; j++)
			{
				if (j > 0)
				{
					System.out.print(" ");
				}
				System.out.print((int)((Math.random()*6) + 1));
			}
		}
	}
}
