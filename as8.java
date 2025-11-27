import java.util.Scanner;

public class as8 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        // Calculate area using formula: Area = π × r²
        double area = 3.14159 * radius * radius;
        
        // Display the result
        System.out.println("Area of the circle: " + area);
        
        // Close scanner
        sc.close();
    }
}