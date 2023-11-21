/*

Assign to the variable
  tell_me_the_hour
the time you calculate given the current hour and a number of
hours to add.

The current hour and the hours to add are provided to the
program in the command line. They should both be positive
integers.

You learned how to do this in the lectures in Restaritmetik
where you had examples like

 If the current hour is 8, in 78 hours the time will be 14.

*/

public class E4 {

  public static void main(String[] args) {

    int current_hour = Integer.parseInt(args[0]);
    int added_hours  = Integer.parseInt(args[1]);

    int tell_me_the_hour = (current_hour + added_hours)%24;

    System.out.println("In "
                      + added_hours
                      + " hours the time would be "
                      + tell_me_the_hour);

  }

}
