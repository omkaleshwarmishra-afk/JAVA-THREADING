package Threading;

public class Demo6 {
    public static void main(String[] args) {
        // Thread creation
//        Thread new stage
        Thread t1 = new Thread(() -> {
            System.out.println("Name of current thread " +Thread.currentThread().getName());
        });
        System.out.println(t1.getState());

//        Runnable stage
        t1.start();
        System.out.println(t1.getState()); // runnable , terminated


       try {

           Thread.sleep(2000);
       }
       catch(Exception e){}
        System.out.println(t1.getState());

    }
}
 // Thread lifecycle