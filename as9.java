import java.util.Scanner;

public class as9 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        
        // Input breadth of the rectangle
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        
        // Calculate area using formula: Area = length × breadth
        double area = length * breadth;
        
        // Display the result
	System.out.println("Area of the rectangle: " + area);  
  
   }
}