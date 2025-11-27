

import java.util.Scanner;

public class as4{// SwapNumbers
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        int a, b;       
        // Input two numbers
        System.out.print("Enter first number (a): ");
        a = input.nextInt();
        
        System.out.print("Enter second number (b): ");
        b = input.nextInt();
        
        // Display values before swapping
        System.out.println();
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping without third variable
        // Logic: Using arithmetic operations
        a = a + b;  // a now contains sum of both numbers
        b = a - b;  // b now gets original value of a
        a = a - b;  // a now gets original value of b
        
        // Display values after swapping
        System.out.println();
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("======================================");
    }
}