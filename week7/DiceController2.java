/*
   This is exercise 7.

   Copy the code from DiceController.java and modify the code so that
   it works with DiceView2 instead of DiceView.

*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceController2 implements ActionListener{
	private DiceModel dm;
	private DiceView2 dv;

	public DiceController2(DiceModel dm_i, DiceView2 dv_i) {
		this.dm = dm_i;
		this.dv = dv_i;
	}

	public void actionPerformed(ActionEvent e) {
		this.dm.roll();
		this.dv.repaint();
	}
}
