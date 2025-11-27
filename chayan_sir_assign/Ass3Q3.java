import java.util.*;
interface SpecialArithmatic{
    void all_devisor(int a);

}
class Arithmatic implements SpecialArithmatic{
    public void all_devisor(int n)
    {
        System.out.print("The Number "+n+" is divisible by :");
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
                System.out.print(" "+i);
                c=1;
        }
        if(c==0)
            System.out.print("None");
        System.out.println();
    }
}
public class Ass3Q3{
    public static void main(String []args)
    {
        SpecialArithmatic obj=new Arithmatic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        obj.all_devisor(num);
    }
}