import java.util.Scanner;

public class as10 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input a number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number");
        } else {
            System.out.println(number + " is an Odd number");
        }
    }
}