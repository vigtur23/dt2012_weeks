/*
   This is exercise 8.

   Copy the code from E5.java and modify the code so that
   it works with DiceView2 and DiceController2.

*/

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class E8{
	public static void main(String[] cmdLn){
		// Your code here.
		JFrame f = new JFrame("Roll a dice");
		JButton b = new JButton("ROLL");

		DiceModel dm = new DiceModel();
		DiceView2 dv = new DiceView2(dm);
		DiceController2 dc = new DiceController2(dm, dv);

		b.addActionListener(dc);

		f.add(dv, BorderLayout.CENTER);
		f.add(b, BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}
