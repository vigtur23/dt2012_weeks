/*
   This is the second exercise.

   Complete the definition of the datatype DiceModel.
   - The constructor initialises the instance variable to a random
   integer between 1 and 6.
   - The method roll stores in an instance variable a random
   integer between 1 and 6.
   - The method read returns the number stored in the instance variable.

   Some examples of running the small test program in main:
   > java DiceModel 10
   6 4 5 5 5 1 6 3 4 3
   > java DiceModel 10
   4 2 3 3 6 1 5 5 3 2
   > java DiceModel 10
   3 5 4 3 4 2 3 4 2 4
   > java DiceModel 10
   2 5 1 5 5 5 4 2 3 5
   >
   */

public class DiceModel{
	// Instance variable
	private int dice;

	// Constructor:

	/*
	   The constructor initialises the instance variable
	   to a randominteger between 1 and 6.
	   */
	public DiceModel(){
		// Your code here
		roll();
	}

	// Methods:

	/*
	   The method roll sets the instance variable dice 
	   to a random integer between 1 and 6.
	   */
	public void roll(){
		dice = (int)((Math.random()*6) + 1);
	}

	/*
	   The method read returns the number
	   stored in the instance variable.
	   */
	public int read(){
		// Your code here
		// OBS: you will have to remove return 0; 
		return dice;
	}

	// Small test program
	public static void main(String[] args){
		int rolls = Integer.parseInt(args[0]);
		DiceModel d = new DiceModel();
		for (int i = 0; i < rolls ; i++ ) {
			d.roll();
			System.out.print(d.read() + " ");
		}
		System.out.println();
	}
}
