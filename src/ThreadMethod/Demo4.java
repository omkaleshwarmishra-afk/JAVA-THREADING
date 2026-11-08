package ThreadMethod;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException{
     Thread t1 = new Thread(() ->{
         while(!Thread.currentThread().isInterrupted()){
             System.out.println("Running");


         }
     });
     t1.start();
     Thread.sleep(1000);

     t1.interrupt();

    }
}


/*

Thread --> interrupt flag (default true)
t1.interrupt() --> sends a signal to t1 thread that it should stop doing what its doing.

we can gracefully handle
->>  cancelling long running task
->> use to stop thread pool

isInterrupted  ->> return flag value

 interrupted ->> return interruped flag value  reset

 ->> sleep()
  */