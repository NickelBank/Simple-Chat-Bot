import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Ally Descoteaux, Eugenia Kovtun, Nick Leblanc
 * @version November 2020
*/
public class Main
{
   /**
        * Create a Magpie, give it user input, and print its replies.
        */
  public static void main(String[] args)
  {
    Magpie maggie = new Magpie();

    System.out.println(maggie.getGreeting());
    Scanner in = new Scanner (System.in);
    String statement = in.nextLine();

    while (!statement.equals("Bye"))
    {
      System.out.println (maggie.getResponse(statement));
      statement = in.nextLine();
    }
  }
}