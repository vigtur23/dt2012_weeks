/*

Add code that prints two numbers that represent the outcome of
throwing 2 dices.

Use Math.random in order to achieve a randomized behaviour.

*/

import java.lang.Math;

public class E9{
  public static void main(String[] args) {

    // Your code here
    System.out.println("The first  dice got the value " + (int)((Math.random()*6) + 1));
    System.out.println("The second dice got the value " + (int)((Math.random()*6) + 1));
  }
}
