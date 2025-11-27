import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        // Rate of interest
        double rate = 5.0;
        
        // Calculate interest for each year
        double amount1 = principal * (1 + rate/100);
        double interest1 = amount1 - principal;
        
        double amount2 = amount1 * (1 + rate/100);
        double interest2 = amount2 - amount1;
        
        double amount3 = amount2 * (1 + rate/100);
        double interest3 = amount3 - amount2;
        
        // Display results
        System.out.println("\nInterest for the first year: " + (int)interest1);
        System.out.println("Interest for the second year: " + (int)interest2);
        System.out.println("Interest for the third year: " + (int)interest3);
        
    }
}