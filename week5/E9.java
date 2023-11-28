/*
   The program reads five command line arguments:
   - The name of a file from the command line.
   The file should be a PNG, GIF, or JPEG file containing an image.

   - An integer X indicating a column number

   - An integer Y indicating a row number

   - An integer T indicating a number of pixels
   (the vertical thickness of a rectangle)

   - An integer L indicating a number of pixels
   (the horisontal length of a  rectangle)

   The program creates a Picture with the image in the file and draws
   a black rectangle  over the  pixels of the image that start in
   the pixel X, Y and extend T pixels down and L pixels to the right.

   The program shows the censored image in a window.

   Your task is to complete the program.
   */

import java.awt.Color;
public class E9{

	public static void main(String[] args) {
		String fileName = args[0];
		int startCol    = Integer.parseInt(args[1]);
		int startRow    = Integer.parseInt(args[2]);
		int length      = Integer.parseInt(args[3]);
		int thickness   = Integer.parseInt(args[4]);

		Picture p = new Picture(fileName);
		for (int i = startCol; i < startCol + length; i++)
		{
			for (int j = startRow; j < startRow + thickness; j++)
			{
				p.set(i, j, Color.BLACK);
			}
		}
		p.show();
	}
}
