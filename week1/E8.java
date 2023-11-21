/*

Add the code needed to take three real numbers as command line arguments.
These numbers are the coordinates of a point: x, y and z.

The program should print the distance from this point to the origin 0,0,0.

Note: to convert a String to a double you should use
  Double.parseDouble
(similar to Integer.parseInt that converts String to int).

*/

import java.lang.Math;

public class E8{

  public static void main(String[] args) {
    Double x = Double.parseDouble(args[0]);
    Double y = Double.parseDouble(args[1]);
    Double z = Double.parseDouble(args[2]);
    System.out.println("The distance to the origin 0,0,0 is: " + Math.sqrt(x*x + y*y + z*z));
  }
}
