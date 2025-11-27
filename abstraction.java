import java.util.*;
abstract class H1{
    protected abstract void go();
    void abcd()
    {
        int z=50;
        System.out.println("Abs1");
    }
}
public class abstraction extends H1
{
    protected void go(){
        System.out.println("Abs2");
    }
    public static void main(String args[]){
        abstraction obj=new abstraction();
        obj.go();
        obj.abcd();
    }
}