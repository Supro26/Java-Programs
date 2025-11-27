// Program to calculate final price of Digital Camera after discount and GST
// Class 9 Project

import java.util.Scanner;

public class as5 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        double printedPrice, discount, priceAfterDiscount, gst, finalAmount;
        
  
        
        // Input printed price
        System.out.print("Enter the printed price of Digital Camera: Rs. ");
        printedPrice = input.nextDouble();
        
        // Calculate discount amount (10% of printed price)
        discount = printedPrice * 10 / 100;
        
        // Calculate price after discount
        priceAfterDiscount = printedPrice - discount;
        
        // Calculate GST amount (6% on price after discount)
        gst = priceAfterDiscount * 6 / 100;
        
        // Calculate final amount to be paid
        finalAmount = priceAfterDiscount + gst;
        
        // Display detailed bill
        System.out.println();
        System.out.println("==========================================");
        System.out.println("           BILL DETAILS");
        System.out.println("==========================================");
        System.out.println("Printed Price       : Rs. " + printedPrice);
        System.out.println("Discount (10%)      : Rs. " + discount);
        System.out.println("------------------------------------------");
        System.out.println("Price after Discount: Rs. " + priceAfterDiscount);
        System.out.println("GST (6%)            : Rs. " + gst);
        System.out.println("------------------------------------------");
        System.out.println("Final Amount to Pay : Rs. " + finalAmount);
        System.out.println("==========================================");
        
        // Close scanner
        input.close();
    }
}