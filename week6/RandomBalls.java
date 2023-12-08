/*
This is NOT an exercise.

This program reads two integer numbers from the command line:
  n: the number of balls
  scale: indicates that the balls will live in a square world
         with x values in [-bound, bound] and y values in [-bound,bound]

It prints to standard output  n lines with 8 values per line:
      1) the x-value for the center of a ball (a random value)
      2) the y-value for the center of a ball (a random value)
      3) the radies of a ball (the same for all balls)
      4,5,6) the red, green and blue components of a color (random)
      7) the x-value of the velocity of a ball.
      8) the y-value of the velocity of a ball.

Use it to generate a file by redirecting standard output.
For example:

java RandomBalls 30 10 > 30balls

will create a file 30balls with 30 lines: each line describes a ball in a
square world [-10,10]

*/

public class RandomBalls{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int scale = Integer.parseInt(args[1]);

    double r = 0.05 * scale;
    double minV = 0.01*scale;
    double maxV = 0.05*scale;

    for (int i = 0; i < n ; i++) {
      // random center between -scale and scale
      System.out.print(Math.random()*2*scale - scale + " ");
      System.out.print(Math.random()*2*scale - scale + " ");

      // radies
      System.out.println(r + " ");

      // random color
      System.out.print((int)(Math.random()*256)+ " ");
      System.out.print((int)(Math.random()*256)+ " ");
      System.out.print((int)(Math.random()*256)+ " ");

      // random velocity between minV and maxV
      System.out.print(minV + Math.random()*(maxV-minV)+ " ");
      System.out.println(minV + Math.random()*(maxV-minV));
    }
  }
}
