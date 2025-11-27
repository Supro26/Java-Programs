import java.util.*;
public class adv_array{
    public static void main(String args[])
    {
        int a[][][]=new int[5][][];
        a[0]= new int[4][];
        a[2]= new int[4][];
        a[1]= new int[2][];
        a[3]= new int[2][];
        a[4]= new int[2][];
        a[0][0]=new int[5];
        Scanner sc=new Scanner(System.in);
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a[i].length;j++)
        //     {
        //         System.out.print("Enter the value: ");
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0;j<a[i].length;j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(a[0][1]);
    }
}