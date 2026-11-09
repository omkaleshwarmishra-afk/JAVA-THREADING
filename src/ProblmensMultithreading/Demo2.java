package ProblmensMultithreading;

public class Demo2 {

    static volatile boolean flag = false;
    public static void main(String[] args){


       Thread t1 = new Thread(() -> {
           try {
               Thread.sleep(1000);
           } catch (Exception e) {}
               flag = true;

       });

        Thread t2 = new Thread(() ->{
            while(!flag ){
//                System.out.println("THread 2 to running");
            }
            System.out.println("thread 2 is stop");

        });

        t1.start();
        t2.start();


    }
}
/*
visibility

Volatile solve visibility problem
 */