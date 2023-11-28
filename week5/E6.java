/*
The program reads the name of a file from the command line.
The file should be a PNG, GIF, or JPEG file containing an image.

The program creates a Picture with the image in the file,
complements the color in each position and shows the complement
image on a window.

Your task is to complete the code for the methods complement
and main.

You should NOT define the method for complementing a color, 
instead you should use the method complement defined in E3.java
to calculate the complement of a Color.
*/



import java.awt.Color;
public class E6{

	public static void complement(Picture pic){
		for (int i = 0; i < pic.width(); i++)
		{
			for (int j = 0; j < pic.height(); j++)
			{
				pic.set(i, j, E3.complement(pic.get(i, j)));
			}
		}
	}

	public static void main(String[] args) {
		String fileName = args[0];
		Picture p = new Picture(fileName);
		complement(p);
		p.show();
	}
}
