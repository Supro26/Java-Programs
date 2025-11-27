import java.util.Scanner;

public class as12{
    
    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        // Check if both are prime and difference is 2
        if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
            System.out.println(num1 + " and " + num2 + " are Twin Prime numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Twin Prime numbers.");
        }

        sc.close();
    }
}
