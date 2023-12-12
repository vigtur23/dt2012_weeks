/*
   This is the third exercise

   Complete the data type DiceView by modifying the class CounterView
   we presented in the lecture.
   (See the code in the PDF file that describes the exercises)

   - Use white for the background color.
   - Write
   Your dice
   in the border.
   - Use SERIF and ITALIC instead of SANS_SERIF and BOLD for the font.
   - Make the JPanel square and not rectangular (100 x 100).
   - Make the number appear centered in the JPanel.
   - Make sure it uses a DiceModel instead of a CounterModel.

*/

// these imports are needed for your code
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

// these imports are needed for main:
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class DiceView extends JPanel {

	/*
	   See the example of a CounterView that we did in class 
	   (included in the PDF file that describes the exercises)
	   */
	private DiceModel dm; 
	public DiceView(DiceModel theModel) {
		dm = theModel;
		setPreferredSize(new Dimension(100, 100));
		setFont(new Font(Font.SERIF, Font.ITALIC, 50));
		setBackground(Color.WHITE);
		setOpaque(true);
		Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border tb = BorderFactory.createTitledBorder(b, "Your dice");
		setBorder(tb);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("" + dm.read(), 40, 70);
	}


	public static void main(String[] cmdLn){
		JFrame f = new JFrame("Anonymous Window");
		DiceModel d = new DiceModel();
		DiceView dv = new DiceView(d);

		f.add(dv, BorderLayout.CENTER);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}

