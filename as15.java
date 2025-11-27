import java.util.Scanner;

public class as15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a multi-digit number: ");
        int number = sc.nextInt();
        
        int original = number;
        int sum = 0;
        
        // Extract each digit and add to sum
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        
        // Display the result
        System.out.println("Sum of digits of " + original + " = " + sum);
        
        sc.close();
    }
}
