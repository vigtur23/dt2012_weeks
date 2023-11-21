/*
This program is compiled using
   javac E6.java

and is run using
   java E6 4

The number 4 is called the command line argument
and is the input to the program.

The output for this input is
    [ 3 divides 4 ] is  false

The purpose of the program is to output whether
3 divides the input number.

Your task is to write the assignment needed to give the variable
threeDividesN the boolean value:
   true      if 3 divides the input number
   false     otherwise
*/
public class E6{

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    boolean threeDividesN = (n%3) == 0;

    System.out.println("[ 3 divides " + n + " ] is  " + threeDividesN);

  }

}
