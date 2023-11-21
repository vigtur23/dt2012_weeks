/*

Add code that prints the Fibonacci words of order 0 through 10.
The words are as follows:
word of order 0 = "a",
word of order 1 = "b",
word of order 2 = "ba",
word of order 3 = "bab",
word of order 4 = "babba",
and in general
word of order n = word of order (n -1) followed by word of order (n-2).

Use string concatenation.
Use several statements to build up the strings and print all 11 words.

*/

public class Bonus{
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String s = "";
		System.out.println("Rang 0: " + a);
		System.out.println("Rang 1: " + b);
		/*
		for (int i = 2; i <= 10; i++) {
			s = b + a;
			a = b;
			b = s;
			System.out.println("Rang " + i + ": " + s);
		}
		*/

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 2: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 3: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 4: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 5: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 6: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 7: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 8: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 9: " + s);

		s = b + a;
		a = b;
		b = s;
		System.out.println("Rang 10: " + s);
	}
}
