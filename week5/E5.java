/*
   The program reads the name of a file from the command line.
   The file should be a PNG, GIF, or JPEG file containing an image.

   The program creates a Picture with the image in the file,
   inverts the image vertically and shows the inverted image
   in a window.

   More about the output can be found in the PDF with explanations.

*/
import java.awt.Color;
public class E5{
	public static void main(String[] args) {
		String fileName = args[0];
		Picture p = new Picture(fileName);

		int w = p.width();
		int h = p.height();
		Color tmp;

		for (int x = 0; x < w; x++)
		{
			for (int y = 0; y < h/2; y++)
			{
				tmp = p.get(x, h-y-1);
				p.set(x, h-y-1, p.get(x, y));
				p.set(x, y, tmp);
			}
		}
		p.show();
	}
}
