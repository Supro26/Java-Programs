/*
 * VARIABLE GLOSSARY:
 * sc        - Scanner object to read input from user
 * number    - The number entered by user; gets modified as digits are extracted
 * original  - Stores the original number for display purposes
 * sum       - Sum of all digits in the number (initialized to 0)
 * product   - Product of all digits in the number (initialized to 1)
 * digit     - Temporarily stores each digit extracted from the number
 */

import java.util.Scanner;

public class as20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int original = number;
        int sum = 0;
        int product = 1;
        
        // Extract each digit and calculate sum and product
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        
        // Check if sum equals product
        if (sum == product) {
            System.out.println(original + " is a Spy Number.");
            System.out.println("Sum of digits = " + sum);
            System.out.println("Product of digits = " + product);
        } else {
            System.out.println(original + " is NOT a Spy Number.");
            System.out.println("Sum of digits = " + sum);
            System.out.println("Product of digits = " + product);
        }
        
        sc.close();
    }
}