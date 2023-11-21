/*

Modify the program to print all values the variables m and n
take as the program executes.

When the program prints the initial values the message
should include:
     "The initial value of n is: "
     "The initial value of m is: "

When the program terminates the message should include:
     "The final value of n is: "
     "The final value of m is: "

For all other intermediate values the message should include:
     "n:  "
     "m:  "
*/

public class E4{

	public static void main(String[] args) {
		int n = 123456789;
		int m = 0;
		System.out.println("The initial value of n is: " + n);
		System.out.println("The initial value of m is: " + m);
		while(n != 0){
			m = (10 * m) + (n % 10);
			n = n / 10;
			System.out.println("n: " + n);
			System.out.println("m: " + m);
		}
		System.out.println("The final value of n is: " + n);
		System.out.println("The final value of m is: " + m);
		System.out.println("And that was all!");
	}
}
