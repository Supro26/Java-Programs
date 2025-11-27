import java.util.Scanner;

public class as13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int temp = num;
        boolean isDuck = false;

        while (temp > 0) {
            int digit = temp % 10; // extract last digit
            if (digit == 0) {
                isDuck = true;
                break;
            }
            temp = temp / 10; // remove last digit
        }

        if (isDuck)
            System.out.println(num + " is a Duck Number.");
        else
            System.out.println(num + " is NOT a Duck Number.");

        sc.close();
    }
}
