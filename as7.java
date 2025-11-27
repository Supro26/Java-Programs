import java.util.Scanner;

public class as7 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input time in seconds
        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();
        
        // Calculate hours
        int hours = totalSeconds / 3600;
        
        // Calculate remaining seconds after extracting hours
        int remainingSeconds = totalSeconds % 3600;
        
        // Calculate minutes from remaining seconds
        int minutes = remainingSeconds / 60;
        
        // Calculate final seconds
        int seconds = remainingSeconds % 60;
        
        // Display the result
        System.out.println(hours + " Hour " + minutes + " Minutes " + seconds + " Seconds");
        
        // Close scanner
        sc.close();
    }
}