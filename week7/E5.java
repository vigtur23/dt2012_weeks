/*

   Complete the class E5 according to the instructions in the PDF file.
   */

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class E5{
	public static void main(String[] cmdLn){
		// Your code here
		JFrame f = new JFrame("Roll a dice");
		JButton b = new JButton("ROLL");

		DiceModel dm = new DiceModel();
		DiceView dv = new DiceView(dm);
		DiceController dc = new DiceController(dm, dv);

		b.addActionListener(dc);

		f.add(dv, BorderLayout.CENTER);
		f.add(b, BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}
