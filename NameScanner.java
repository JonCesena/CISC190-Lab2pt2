import java.util.Scanner;

/**
 * This Java application uses the scanner class and methods to
 * get name inputs from a user.
 * @author Jon Cesena
 * @since 2026-02-17
 * @version 1.0
 */

public class NameScanner
{
    public static void main(String[] arg)
    {
        String firstName, middleName, lastName;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        
        System.out.print("Enter your middle name: ");
        middleName = keyboard.nextLine();
        
        System.out.print("Enter your last name: ");
        lastName = keyboard.nextLine();
        
        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);
        
        System.out.println("\nMy name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initals are: " + firstInit + middleInit + lastInit);
    }
}