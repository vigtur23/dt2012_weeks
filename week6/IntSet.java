/*
   This is the Bonus exercise.
   Complete the implementation of the abstract data type IntSet.
   The values are sets of non negative integers upto an upper bound.

   Examples of values for set of non-negative integers upto 10000 are
   {0, 10, 1102}
   {2, 5, 7, 11}
   {}

   The operations we want to do are:
   add an element (an integer that is between 0 and the bound)
   test whether an integer between 0 and the bound belongs to the set

   For the implementation use an array of booleans with indices 0 .. bound
   (length is bound + 1). The possible elements of the set are the indices
   of the array. A value true for an index X means that X is in the set.

   Below you see the API. We include two constructors:
   one for the empty set
   one for a set where the elements are given in an array of integers

   In all cases you can assume that the integer values provided as arguments
   are in the correct range.

*/

public class IntSet{
	private boolean is[];

	public IntSet(int n){
		// Your code here: constructor for the empty set of positive integers
		// between 0 and n.
		this.is = new boolean[n + 1];
	}

	public IntSet(int n, int[] values){
		// Your code here: constructor for the set of positive integers
		// between 0 and n
		// with the members  provided by the array values.
		this.is = new boolean[n + 1];
		for (int v : values)
		{
			this.is[v] = true;
		}
	}

	public boolean has(int x){
		// Your code here: tests whether the integer x belongs to this set.
		return this.is[x];
	}

	public void addValue(int x){
		// Your code here: adds the element x to this set.
		this.is[x] = true;
	}

	public String toString(){
		// Your code here: returns a String version of this set.
		String s = "{";
		for (int i = 0; i < this.is.length; i++)
		{
			if (this.is[i])
			{
				if (s.length() != 1)
				{
					s += ", ";
				}
				s += i;
			}
		}
		return s + "}";
	}

	public static void main(String[] args){
		// Your code here: a small test of operations of IntSet.
		int[] ta = {1, 4, 2, 5, 6};
		IntSet iset = new IntSet(10, ta);
		System.out.println(iset);
		iset.addValue(3);
		System.out.println(iset);
		System.out.println("iset has" + (iset.has(3) ? "" : " not") + " the number 3");
	}
}
