import java.util.Scanner;

public class as14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a multi-digit number: ");
        int number = sc.nextInt();
        
        int original = number;
        int reverse = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        
        // Check if original and reverse are equal
        if (original == reverse) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}