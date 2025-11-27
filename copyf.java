// import java.util.*;
class check{
    int x=3;
    double f=1.1;
    public void printing()
    {
        System.out.println("Check class.");
        System.out.println(x);
        System.out.println(f);
    }
}
public class copyf{
    public static void main(String args[])
    {
        check ob=new check();
        ob.printing();
        check ob2=ob;
        ob2.x=10;
        ob2.f=2.34;
        check ob3=new check();
        System.out.println(ob3.f);
        System.out.println(ob3.x);
        System.out.println(ob.x);
    }
}