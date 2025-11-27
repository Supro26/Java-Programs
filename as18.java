/*
 * VARIABLE GLOSSARY:
 * sc        - Scanner object to read input from user
 * number    - The number entered by user to be checked
 * count     - Counter to count the number of factors
 * i         - Loop variable used to find factors
 */

import java.util.Scanner;

public class as18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int count = 0;
        
        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Check if it is a prime number
        if (count == 2) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
        
        System.out.println("Number of factors = " + count);
        
        sc.close();
    }
}