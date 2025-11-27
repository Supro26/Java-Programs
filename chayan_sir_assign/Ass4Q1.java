import java.util.*;
public class Ass4Q1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers to be divided:\nNumber 1: ");
        int n1=sc.nextInt();
        System.out.println("Number 2: ");
        int n2=sc.nextInt();
        double div=0;
        try{
            div=n1/n2;
            System.out.println("Result: "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Divisible by 0 is not allowed!!");
        }
        System.out.println("Enter 5 elements in the arra, respectively:");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element position to access :-");
        int pos=sc.nextInt();
        try{
            System.out.println(arr[pos-1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Position entered is Out Of Bound!!");
        }
    }
}
