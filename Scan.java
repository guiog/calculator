import java.util.Scanner;  // Import the Scanner class

public class Scan {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input

    String LoserName = myObj.nextLine();  // Read user input
    System.out.println("Losername is: " + LoserName);  // Output user input
  }
}