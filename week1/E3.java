/*
This program is compiled using
   javac E3.java

and is run using
   java E3 10 20

The numbers 10 and 20 are called the command line arguments
and are the input to the program.

Command line arguments are passed to the program as strings (text).
When we want the program to use them as numbers we need to convert
them. This conversion is done with Integer.parseInt.

Add code that exchanges the values of the variables a and b.

*/

public class E3{

  public static void main(String[] args) {

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("The value of a is " + a);
    System.out.println("and the value of b is  " + b);

    a = Integer.parseInt(args[1]);
    b = Integer.parseInt(args[0]);

    System.out.println("The value of a is now " + a);
    System.out.println("and the value of b is now " + b);

  }

}
