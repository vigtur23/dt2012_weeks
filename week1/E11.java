/*

Add code to
  read three int values from the command line and
  print them in ascending order.

Use Math.min() and Math.max().

*/

public class E11{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    System.out.println(Math.min(Math.min(a, b), c));
    System.out.println(Math.max(Math.min(a, b), Math.max(Math.min(a, c), Math.min(b, c))));
    System.out.println(Math.max(Math.max(a, b), c));
  }
}
