import java.util.Scanner;

/**
 * This Java application receives a meal amount, calculates the tax for the bill, recommends a
 * tip amount, then lists the total meal cost with both added.
 * @author Jon Cesena
 * @since 2026-02-17
 * @version v1.0
 */

public class MealCostScanner
{
    public static void main(String[] arg)
    {
        Double mealCost, mealTotal;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter meal amount: ");  //Receives the base meal cost.
        mealCost = keyboard.nextDouble();
        
        final double TAX = 1.72;            //Sets tax amount
        final double TIP = 5.10;            //Sets tip amount
        mealTotal = mealCost + TAX + TIP;   //Sets total cost
           
        System.out.printf("\nThe tax is: " + "$%,.2f", TAX);
        System.out.printf("\nThe tip is: " + "$%,.2f", TIP);
        System.out.printf("\nThe meal cost with tax and tip is: " + mealTotal);
        
    }
}