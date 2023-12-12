/*
   - Complete the code in main to:
   - create a JFrame with title: Throwing a dice
   - add  a  JLabel with the text of the string INSTR to the JFrame.
   (INSTR is already defined as a constant in the  class E1)
   - add a JButton with the text ROLL to the JFrame.
   - add an action listener to the JButton (see the next exercise)

   - Complete the code for the class Roller so that an object
   of type Roller can be added as the action listener of the
JButton: when pressing the button the program should print a random
number between 1 and 6 to standard output.
Notice that the class Roller is in this same file and that
it is not public.
*/


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class E1{
	private static final String INSTR =
		"<html>"
		+
		"Use the button to throw the dice. <br/>"
		+
		"You see your dice in standard output."
		+
		"</html>";

	public static void main(String[] cmdLn){
		JFrame f = new JFrame("Roll a dice");
		JLabel m = new JLabel(INSTR);
		JButton b = new JButton("ROLL");
		b.addActionListener(new Roller());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		f.add(m, BorderLayout.CENTER);
		f.add(b, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
}

class Roller implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println((int)((Math.random()*6) + 1));
	}
}
