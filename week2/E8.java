/*

The program solves the quadratic equation
    a*x*x + b*x + c = 0

Your task is to improve it to that if there is
no solution (in the real numbers)
the program does not try to calculate the roots.

There are no solutions when the discriminant is negative.

If there are no solutions the program should print the message
    There are no real solutions.
and terminate.

You have to decide where to place your code.

*/
import java.lang.Math;
public class E8 {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double disc = b * b - 4 * a * c;
		if (disc < 0)
		{
			System.out.println("There are no real solutions.");
		}
		else
		{
			double sol1 = (-b + Math.sqrt(disc)) / (2 * a);
			double sol2 = (-b - Math.sqrt(disc)) / (2 * a);
			System.out.println(sol1);
			System.out.println(sol2);
		}
	}
}
