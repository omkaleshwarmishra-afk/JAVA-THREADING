package ThreadMethod;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() ->{
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
            System.out.println("Thread-0 starts");
        });

        t1.start();
      //   t1.join();
        t1   .join(1000);  // let the t1 thread first complete
        System.out.println("main thread end");
    }
}
// join()
/*
main thread --> Waiting
t1 thread --> runnable
main thread --> waiting --> terminated

 */