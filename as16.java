/*
 * VARIABLE GLOSSARY:
 * sc        - Scanner object to read input from user
 * num1      - First number entered by user
 * num2      - Second number entered by user
 * sum1      - Sum of all factors of num1 (excluding num1 itself)
 * sum2      - Sum of all factors of num2 (excluding num2 itself)
 * i         - Loop variable used to find factors
 */

import java.util.Scanner;

public class as16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int sum1 = 0;
        int sum2 = 0;
        
        // Find sum of factors of num1 (excluding num1)
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        
        // Find sum of factors of num2 (excluding num2)
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 = sum2 + i;
            }
        }
        
        // Check if they are amicable numbers
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are Amicable Numbers.");
            System.out.println("Sum of factors of " + num1 + " = " + sum1);
            System.out.println("Sum of factors of " + num2 + " = " + sum2);
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Amicable Numbers.");
            System.out.println("Sum of factors of " + num1 + " = " + sum1);
            System.out.println("Sum of factors of " + num2 + " = " + sum2);
        }
        
        sc.close();
    }
}