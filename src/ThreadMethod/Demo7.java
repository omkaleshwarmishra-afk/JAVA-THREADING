package ThreadMethod;

public class Demo7 {
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
            System.out.println("Custom thread running");
        });
        Thread t2 = new Thread(() ->{
            System.out.println("Custom thread running");
        });
        t1.start();
        t2.start();

        System.out.println( t1.getPriority());
    }
}
/*
Thread Priority
MAX_PRIORITY = 10
MIN_PRIORITY = 1
norm_PRIORITY = 5

depend on os

->

 */