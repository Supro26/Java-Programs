/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Chayanz
 */
class banking
{
    int balance;
   boolean flag=false;
    banking(int b)
    {
        balance=b;
    }
  public synchronized void credit(int value)
   {
    while(flag){
      try{
           wait();
      }
      catch(InterruptedException e)
      {
       System.out.println("caught exdception at credit");
      }
    }
       balance=balance+value;
       System.out.println("Balance after credit is: " + balance);
       flag=true;
       notify();
}
  public synchronized void debit(int value)
   {
      while(!flag){
           try{
                wait();
           }
           catch(InterruptedException e)
           {
            System.out.println("caught exdception at credit");
           }
      }
       balance=balance-value;
       System.out.println("Balance after debit is: " + balance); 
      flag=false;
      notify();
   }
//   public synchronized int get_value_credit()
//   {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter value for credit");
//       return sc.nextInt();
//   }
//   public synchronized int get_value_debit()
//   {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter value to debit");
//       return sc.nextInt();     
//   }
}

class mydefined_thread implements Runnable
{
    Thread th;
    String sstr;
    banking bnk;
    mydefined_thread(banking bnk,String str)
    {
        this.bnk=bnk;
        sstr="Hello " + str;
        th=new Thread(this, str);
        th.start();
    }
    public void run()
    {
//        synchronized (bnk){
//            bnk.credit(2000);
//        }
//        synchronized (bnk){
//            bnk.debit(1000);
//        }
        System.out.println("Current Running Thread is: " + Thread.currentThread().getName());
        System.out.println("Current Thread Object is: " + sstr);
        for(int i=0;i<5;i++)
         bnk.credit(3000);
    }
}
class consumer_thread implements Runnable
{
    Thread th;
    String sstr;
    banking bnk;
    consumer_thread(banking bnk, String str)
    {
        this.bnk=bnk;
        sstr="Hello " + str;
        th=new Thread(this, str);
        th.start();
    }
    public void run()
    {
//        synchronized (bnk){
//            bnk.credit(2000);
//        }
//        synchronized (bnk){
//            bnk.debit(1000);
//        }
        System.out.println("Current Running Thread is: " + Thread.currentThread().getName());
        System.out.println("Current Thread Object is: " + sstr);
        for(int i=0;i<5;i++)
            bnk.debit(2000);
    }
}
public class Thread_sync_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        banking bnk=new banking(3000);
        mydefined_thread myth=new mydefined_thread(bnk,"Thread1");
        consumer_thread myth2=new consumer_thread(bnk,"Thread2");
        try
        {
            myth.th.join();
            myth2.th.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("caught exdception at Main");
        }
        
    }
    
}
