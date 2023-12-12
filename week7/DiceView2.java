/*

   This is exercise 6.

   Program a datatype DiceView2 that instead of text uses images
   to show the result of rolling a dice.

   Among the files for this week you got 6 freely distributed .gif files
   containing images of the 6 sides of a dice.

   Images can be displayed on a JLabel displaying an ImageIcon.
   To create a JLabel you can use the constructor as in:
   new JLabel(new ImageIcon(  filename  ))
   refering to a file with an image.
   To change the image in a JLabel you can use the method setIcon as in
   .setIcon(new ImageIcon( filename ))

   We suggest that you
   - add an instance variable of type JLabel,

   - create a JLabel in the constructor for DiceView2 and assign it to the
   instance variable,
   - add the JLabel to this (yes, a JPanel can have components, like a JFrame)
   also in the constructor,
   - use the color with components 0, 100, 0 for the JPanel
   (also in the constructor),

   - update the image in the JLabel in the paintComponent method.

   You can do all this by modifying the code for DiceView.
   You need to remove the parts about fonts and drawString.
   Copy the content of DiceView.java to this file and do the modifications.


*/

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Graphics;

// these two imports are needed for main:
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class DiceView2 extends JPanel{

	private DiceModel dm;
	private JLabel theDice;
	private JLabel img;

	public DiceView2(DiceModel dm){
		this.dm = dm;
		setBackground(new Color(0, 100, 0));
		setOpaque(true);
		Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border tb = BorderFactory.createTitledBorder(b, "Your dice");
		setBorder(tb);
		img = new JLabel(findGif(this.dm.read()));
		add(img);
	}

	private ImageIcon findGif(int i)
	{
		return new ImageIcon("dice" + i + ".gif");
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		img.setIcon(findGif(this.dm.read()));
	}


	public static void main(String[] cmdLn){
		JFrame f = new JFrame("Anonymous Window");
		DiceModel d = new DiceModel();
		DiceView2 dv = new DiceView2(d);

		f.add(dv, BorderLayout.CENTER);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}
