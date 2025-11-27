import java.util.Scanner;
public class as3 {//StudentMarks
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        String studentName;
        int physics, chemistry, biology, computer;
        double average;
        // Input student name
        System.out.print("Enter Student Name: ");
        studentName = input.nextLine(); 
        // Input marks for each subject
        System.out.print("Enter marks in Physics: ");
        physics = input.nextInt();        
        System.out.print("Enter marks in Chemistry: ");
        chemistry = input.nextInt();      
        System.out.print("Enter marks in Biology: ");
        biology = input.nextInt();      
        System.out.print("Enter marks in Computer: ");
        computer = input.nextInt();        
        // Calculate average
        average = (physics + chemistry + biology + computer) / 4.0;        
        // Display results
        System.out.println();
        System.out.println("======================================");
        System.out.println("           RESULT");
        System.out.println("======================================");
        System.out.println("Student Name: " + studentName);
        System.out.println("--------------------------------------");
        System.out.println("Physics   : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Biology   : " + biology);
        System.out.println("Computer  : " + computer);
        System.out.println("--------------------------------------");
        System.out.println("Average Marks: " + average);
        System.out.println("======================================");
    }
}