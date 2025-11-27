/*
 * VARIABLE GLOSSARY:
 * sc        - Scanner object to read input from user
 * choice    - Stores user's menu choice (1, 2, 3, or 4)
 * side      - Side length of the square
 * length    - Length of the rectangle
 * breadth   - Breadth (width) of the rectangle
 * radius    - Radius of the circle
 * area      - Calculated area of the selected shape
 */

import java.util.Scanner;

public class as19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== AREA CALCULATOR =====");
        System.out.println("1. Area of Square");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Circle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = sc.nextInt();
        double area = 0;
        
        switch (choice) {
            case 1:
                // Area of Square
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square = " + area);
                break;
                
            case 2:
                // Area of Rectangle
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of Rectangle = " + area);
                break;
                
            case 3:
                // Area of Circle
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                System.out.println("Area of Circle = " + area);
                break;
                
            case 4:
                // Exit
                System.out.println("Thank you for using Area Calculator!");
                break;
                
            default:
                System.out.println("Invalid choice! Please enter 1-4.");
        }
        
        sc.close();
    }
}