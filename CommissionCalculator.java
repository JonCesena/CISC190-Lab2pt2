import java.util.Scanner;

/**
 * This Java application reveives number of shares and cost per share from the user.
 * Then calculates the total share cost, commission cost, and the cost with those
 * added together.
 * @author Jon Cesena
 * @since 2026-02-17
 * @version v1.0
 */
public class CommissionCalculator
{
    public static void main(String[] arg)
    {
        Double shares, perSharePrice;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of shares purchased: ");
        shares = keyboard.nextDouble();
        
        System.out.print("Enter price per share: ");
        perSharePrice = keyboard.nextDouble();
        
        double commissionCost = 261.24;
        double sharesTotal = shares * perSharePrice;
        double totalCost = sharesTotal + commissionCost;
        
        System.out.printf("\nTotal cost of shares are: " + "$%,.2f", sharesTotal);
        System.out.printf("\nCommission cost is: " + "$%,.2f", commissionCost);
        System.out.printf("\nTotal cost is: " + "$%,.2f", totalCost);
    }
}