import java.util.Scanner;
import java.util.Locale;
import java.awt.Color;
public class ManyBalls{

	/*
	   Exercise 3:
	   Complete the definition of nextBall to read 8 numbers from the argument data:
	   1) the x-value for the center of a ball (a double)
	   2) the y-value for the center of a ball (a double)
	   3) the radies of a ball (a double)
	   4,5,6) the red, green and blue components of a color (integers)
	   7) the x-value of the velocity of a ball (a double)
	   8) the y-value of the velocity of a ball (a double)
	   and return a bouncing ball described by these values.
	   */
	public static BouncingBall nextBall(Scanner data){
		double x = data.nextDouble();
		double y = data.nextDouble();
		double r = data.nextDouble();
		Color c = new Color(data.nextInt(), data.nextInt(), data.nextInt());
		double dx = data.nextDouble();
		double dy = data.nextDouble();
		return new BouncingBall(x, y, r, c, dx, dy);
	}

	/*
	   Exercise 4:
	   Complete the definition of readAll using nextBall n times
	   and return an array with the n bouncing balls.
	   */
	public static BouncingBall[] readAll(Scanner data, int n){
		BouncingBall balls[] = new BouncingBall[n];
		for (int i = 0; i < n; i++)
		{
			balls[i] = nextBall(data);
		}
		return balls;
	}



	/*
	   Exercise 5:
	   Complete the definition of drawAll that draws all the bouncing balls in
	   the array balls.
	   */
	public static void drawAll(BouncingBall[] balls){
		for (BouncingBall b : balls)
		{
			b.draw();
		}
	}

	/*
	   Exercise 6:
	   Complete the definition of moveAll that moves all the bouncing balls in
	   the array balls in a square world [-bound, bound]
	   Moving a ball involves bouncing if the ball collides and then using the
	   method move.
	   */
	public static void moveAll(BouncingBall[] balls, int bound){
		for (BouncingBall b : balls)
		{
			b.move();
			if (b.collideX(bound))
			{
				b.bounceX();
			}
			if (b.collideY(bound))
			{
				b.bounceY();
			}
		}
	}



	/*
	   The definition of main is NOT an exercise: 
	   it is a test for your solutions to the exercises above.

	   A client program that animates n balls.
	   The balls live in a square world [-10,10]
	   The program reads the data for each ball from standard input.

	   Try the program redirecting standard input to a file.
	   Use for example the result of generating 30 random balls with

	   java RandomBalls 30 10 > 30balls

	   using

	   java ManyBalls 30 < 30balls

	   Or, better 

	   java RandomBalls 30 10 | java 30 

*/
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Scanner data = new Scanner(System.in).useLocale(Locale.US);
		BouncingBall[] balls = readAll(data,n);

		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(-10,10);
		StdDraw.setYscale(-10,10);
		while (true)  {
			moveAll(balls, 10);
			StdDraw.clear();
			drawAll(balls);
			StdDraw.show();
			StdDraw.pause(20);
		}
	}
}
