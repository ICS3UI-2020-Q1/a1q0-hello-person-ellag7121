import java.util.Scanner;

/**
 * THis program will greet the user and calculate their approximate age
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Declare a variable to store a name
    String userName;
    
    //ask user for their name
    System.out.println("Please enter your name:");
    //init the user's name
    userName = input.nextLine();

    //say hello to the user
    System.out.println("Hello " + userName + "!");

    //ask user for birth year
    System.out.println("Please enter the year you were born:");
    //declare and initialize a variable to store the user's birth year
    int birthYear = input.nextInt();

    //declare and initialize a constant for the current year
    final int CURRENT_YEAR = 2020;
    
    //declare and calculate the user's age
    int age = CURRENT_YEAR - birthYear;
    //tell the user their approximate age
    System.out.println("You are " + age + " years old.");
  }
}
