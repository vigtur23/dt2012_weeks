/*
The class Picture has to be in the same directory as this program.
It is included in the zip file.

The program reads two integer values w and h from the command line
and creates a picture of size w x h with random colors.

A random color is a color with random red, green and blue components.

The program ends by showing the picture in a window.

More details about the output in the PDF file with explanations for each exercise.
*/
import java.awt.Color;
public class E4{
	public static void main(String[] args) {
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		Picture p = new Picture(w, h);

		int r = 0;
		int g = 0;
		int b = 0;

		for (int i = 0; i < w; i++)
		{
			for (int j = 0; j < h; j++)
			{
				r = (int)(Math.random()*256); // 256 since Math.random never returns 1, it returns a value 0 <= x < 1
				g = (int)(Math.random()*256);
				b = (int)(Math.random()*256);
				p.set(i, j, new Color(r, g, b));
			}
		}
		p.show();
	}
}
