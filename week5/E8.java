/*
   The program reads five command line arguments:
   - The name of a file from the command line.
   The file should be a PNG, GIF, or JPEG file containing an image.
   - An integer indicating a number of pixels
   - Three integers in the range [0, 255] indicating the three
   components of a color.

   The program creates a Picture with the image in the file and draws
   a frame (ram på svenska) over the border pixels of the image.
   The color of the frame is the color with components given in the
   command line. The thickness of the frame is the number of pixels
   given in the command line.

   The program shows the framed image in a window.

   Your task is to complete the program.

*/
import java.awt.Color;
public class E8{

	public static void main(String[] args) {
		String fileName = args[0];
		int borderPx = Integer.parseInt(args[1]);
		int red    = Integer.parseInt(args[2]);
		int green  = Integer.parseInt(args[3]);
		int blue   = Integer.parseInt(args[4]);

		Picture p = new Picture(fileName);
		Color c = new Color(red, green, blue);

		for (int i = 0; i < borderPx; i++)
		{
			// up down
			for (int j = 0; j < p.width(); j++)
			{
				p.set(j, i, c);
				p.set(j, p.height() - i - 1, c);
			}
			// left right
			for (int j = borderPx; j < p.height() - borderPx; j++)
			{
				p.set(i, j, c);
				p.set(p.width() - i - 1, j, c);
			}
		}

		p.show();
	}
}
