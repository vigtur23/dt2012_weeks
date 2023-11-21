/*

Add code to print
five uniform random values between 0 and 1,
their average value and
their minimum and maximum value.

Use Math.random(), Math.min(), and Math.max().

*/

import java.lang.Math;

public class E10{
	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(" ");
		System.out.println("Average: " + ((a+b+c+d+e)/5));
		System.out.println("Min: " + Math.min(Math.min(Math.min(Math.min(a, b), c), d), e));
		System.out.println("Max: " + Math.max(Math.max(Math.max(Math.max(a, b), c), d), e));
	}
}
