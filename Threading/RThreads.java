class A implements Runnable{
    public void run(){
        System.out.println("HII");
    }
}
public class RThreads {
    public static void main(String[] args) {
        Runnable o=new A();
        Thread t=new Thread(o);//as tehre is no thread class in runnable, we create obj of thread class seperately.
        t.start();//to start the run() on A we pass obj of A in parameter for thread constructor.
    }
}
