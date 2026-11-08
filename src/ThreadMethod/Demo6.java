package ThreadMethod;

public class Demo6 {
    public static void main(String[] args){
        Thread t2 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.setName("worker-1");
  t2.start();
    }
}
/*
currentThread() --> reference of current running thread
 */