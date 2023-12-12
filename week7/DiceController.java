/*
   This is the fourth exercise

   Complete the data type DiceController by modifying the class
   CounterController we presented in the lecture.

   - Make sure it uses a DiceModel and a DiceView instead of a
   CounterModel and a CounterView.
   */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController implements ActionListener{
	private DiceModel dm;
	private DiceView dv;

	public DiceController(DiceModel dm_i, DiceView dv_i) {
		this.dm = dm_i;
		this.dv = dv_i;
	}

	public void actionPerformed(ActionEvent e) {
		this.dm.roll();
		this.dv.repaint();
	}
}
