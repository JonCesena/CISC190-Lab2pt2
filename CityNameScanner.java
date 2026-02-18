import java.util.Scanner;

/**
 * This Java application asks the user to enter a city name. It then returns total
 * number of characters in the name, manipulates the name to all upper case, all 
 * lower case, and lists the first character.
 * @author Jon Cesena
 * @since 2026-02-17
 * @version v1.0
 */

public class CityNameScanner
{
    public static void main(String[] arg)
    {
        String cityName, totalChar, upperCase, lowerCase, firstChar;
        
        Scanner keyboard = new Scanner(System.in);
        
        //Receives the city input
        
        System.out.print("Enter a city: ");
        cityName = keyboard.nextLine();
        
        //The following manipulates the City Name in specified ways.
        
        System.out.println("\n" + cityName.length());
        System.out.println(cityName.toUpperCase());    
        System.out.println(cityName.toLowerCase());
        System.out.println(cityName.charAt(0));      
        
    }
}