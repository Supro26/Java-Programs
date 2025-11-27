class MyMultithread extends Thread{
    public void run()
    {
        for(int i=0; i<5;i++)
        {
            System.out.println(i);
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e){
        }
        }
    }
} 
public class threads{
    public static void main(String[] args) {
        MyMultithread mt=new MyMultithread();
        MyMultithread mt2=new MyMultithread();
        mt.start();
        mt2.start();
    }
}