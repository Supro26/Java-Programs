/*
 * VARIABLE GLOSSARY:
 * sc        - Scanner object to read input from user
 * number    - The number entered by user to be checked
 * sum       - Sum of all factors of the number (excluding the number itself)
 * i         - Loop variable used to find factors
 */

import java.util.Scanner;

public class as17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        
        // Find sum of all factors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        
        // Check if it is a perfect number
        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
            System.out.println("Sum of factors = " + sum);
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
            System.out.println("Sum of factors = " + sum);
        }
        
        sc.close();
    }
}