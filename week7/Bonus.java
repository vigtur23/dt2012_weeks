import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
	private DiceController2[] controllers;
	private DiceModel[] models;
	private JFrame f;
	private ResultView rv;

	public Bonus(int size)
	{
		// Init vars
		controllers	= new DiceController2[size];
		models		= new DiceModel[size];

		// Setup frame
		f = new JFrame("Roll a dice");
		f.setLayout(new BorderLayout());

		// Setup north part holding resultview
		rv = new ResultView("Odds");
		f.add(rv, BorderLayout.NORTH);

		// Setup center part holding the dices
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		for (int i = 0; i < controllers.length; i++)
		{
			DiceModel dm = new DiceModel();
			DiceView2 dv = new DiceView2(dm);
			DiceController2 dc = new DiceController2(dm, dv);
			controllers[i] = dc;
			models[i] = dm;

			p.add(dv);
		}
		f.add(p, BorderLayout.CENTER);

		// Setup south part holding the button
		JButton b = new JButton("ROLL");
		b.addActionListener(this);
		f.add(b, BorderLayout.SOUTH);

		// Update the resultview to match the result of the dices
		checkRes();
	}
	
	public void show()
	{
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] cmdLn){
		Bonus b = new Bonus(5);
		b.show();
	}

	private void checkRes()
	{
		int sum = 0;
		for (DiceModel model : models)
		{
			sum += model.read() % 2;
		}
		rv.checkRes(sum, models.length);
	}


	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < controllers.length; i++)
		{
			controllers[i].actionPerformed(e);
		}
		checkRes();
	}
}

class ResultView extends JPanel {

	/*
	   See the example of a CounterView that we did in class 
	   (included in the PDF file that describes the exercises)
	   */
	private String res;
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

	public void checkRes(int i, int size)
	{
		if (i == 0)
		{
			res = "Evens";
		}
		else if (i == size)
		{
			res = "Odds";
		}
		else
		{
			res = "No Luck!";
		}
		this.repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("" + res, 40, 70);
	}
}

