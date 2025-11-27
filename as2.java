import java.util.Scanner;

public class as2 {//SalaryCalculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input employee details
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter basic pay: ");
        double basicPay = sc.nextDouble();
        
        // Calculate components
        double da = 0.25 * basicPay;   // 25% of Basic Pay
        double hra = 0.15 * basicPay;  // 15% of Basic Pay
        double pf = 0.0833 * basicPay; // 8.33% of Basic Pay
        
        // Calculate salaries
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf;
        
        // Display results
        System.out.println("EMPLOYEE SALARY DETAILS\n");
        System.out.println("Employee Name    : "+name);
        System.out.println("Basic Pay        : Rs. "+basicPay);
        System.out.println("DA (25%%)         : Rs. "+da);
        System.out.println("HRA (15%%)        : Rs. "+hra);
        System.out.println("PF (8.33%%)       : Rs. "+pf);
        System.out.println();
        System.out.println("Gross Salary     : Rs. "+grossSalary);
        System.out.println("Net Salary       : Rs. "+netSalary);
        
    }
}