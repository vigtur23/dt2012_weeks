/*
This program is compiled using
   javac E2.java

and is ran using
   java E2 vero

Here vero is called the command line argument and is the
input to the program.

Run the program using your name in the command line.

Add code that adds the text

  and hope you enjoy coding

after the input from the command line and before the exclamation
mark. Keep just one command System.out.println and add to the
expression that calculates the string that is printed.

Make sure there is a white space between the input from the user
and the rest of the sentence.

*/
public class E2{

  public static void main(String[] args) {

    System.out.println("Welcome to the course " + args[0] + " and hope you enjoy coding!");

  }

}
