// package Threading;
class Printer{
    void printdoc(int n,String docname){
        for(int i=1;i<=n;i++){
            System.out.println(">> Printing "+docname+" "+i);
        }
    }
}
class myThread implements Runnable{
    Printer ptr;
    myThread(Printer p){ ptr=p; }
    public void run(){
        ptr.printdoc(10, "MyProfile.pdf");
    }
}
public class SyncApp {
    public static void main(String[] args) {
        Printer pr=new Printer();
        // pr.printdoc(10, "MyProfile.pdf");
        Runnable r= new myThread(pr);
        Thread th= new Thread(r);
        th.start();
    }
}
