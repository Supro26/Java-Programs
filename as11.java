import java.util.Scanner;

public class as11
 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input a number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Store the original number for later use
        int originalNumber = number;
        
        // Variable to store sum of digits
        int sumOfDigits = 0;
        
        // Calculate sum of digits
        while (number > 0) {
            int digit = number % 10;      // Extract last digit
            sumOfDigits = sumOfDigits + digit;  // Add digit to sum
            number = number / 10;         // Remove last digit
        }
        
        // Check if original number is divisible by sum of digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Niven number");
        } else {
            System.out.println(originalNumber + " is not a Niven number");
        }
        
        // Close scanner
        sc.close();
    }
}