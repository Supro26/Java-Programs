import java.util.Scanner;

public class as6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: price of the article
        System.out.print("Enter the price of the article: ");
        double price = sc.nextDouble();

        // Shopkeeper 1: Single 30% discount
        double discount1 = price * 0.30;
        double finalPrice1 = price - discount1;

        // Shopkeeper 2: Two successive discounts of 20% and 10%
        double firstDiscount = price * 0.20;
        double priceAfterFirst = price - firstDiscount;
        double secondDiscount = priceAfterFirst * 0.10;
        double totalDiscount2 = firstDiscount + secondDiscount;
        double finalPrice2 = priceAfterFirst - secondDiscount;

        // Display results
        System.out.println("\n--- Discount Comparison ---");
        System.out.println("Original Price: ₹" + price);
        System.out.println("Shopkeeper 1 (30% discount):");
        System.out.println("   Discount = ₹" + discount1);
        System.out.println("   Final Price = ₹" + finalPrice1);

        System.out.println("\nShopkeeper 2 (20% and 10% successive discounts):");
        System.out.println("   Total Discount = ₹" + totalDiscount2);
        System.out.println("   Final Price = ₹" + finalPrice2);

        // Compare which is better
        if (finalPrice1 < finalPrice2) {
            System.out.println("\nShopkeeper 1 gives a better deal.");
        } else if (finalPrice2 < finalPrice1) {
            System.out.println("\nShopkeeper 2 gives a better deal.");
        } else {
            System.out.println("\nBoth shopkeepers offer the same final price.");
        }

        sc.close();
    }
}
