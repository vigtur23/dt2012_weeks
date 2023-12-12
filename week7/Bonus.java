import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bonus implements ActionListener {
	private DiceController2[] controllers = new DiceController2[5];
	public static void main(String[] cmdLn){
		// Your code here.
		JFrame f = new JFrame("Roll a dice");
		JButton b = new JButton("ROLL");
		ResultView rv = new ResultView("Odds");

		f.add(rv);
		for (int i = 0; i < controllers.length; i++)
		{
			DiceModel dm = new DiceModel();
			DiceView2 dv = new DiceView2(dm);
			DiceController2 dc = new DiceController2(dm, dv);
			controllers[i] = dc;

			b.addActionListener(this);

			f.add(dv, BorderLayout.CENTER);
		}
		f.add(b, BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		for (DiceController2 dc : controllers)
		{
			dc.actionPerformed(e);
		}
	}
}

class ResultView extends JPanel {

	/*
	   See the example of a CounterView that we did in class 
	   (included in the PDF file that describes the exercises)
	   */
	String res;
	public ResultView(String result) {
		res = result;
		setPreferredSize(new Dimension(100, 100));
		setFont(new Font(Font.SERIF, Font.ITALIC, 50));
		setBackground(Color.WHITE);
		setOpaque(true);
		Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border tb = BorderFactory.createTitledBorder(b, "Outcome");
		setBorder(tb);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("" + res, 40, 70);
	}
}

