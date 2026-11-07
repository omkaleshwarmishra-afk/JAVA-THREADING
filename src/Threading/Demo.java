package Threading;

public class Demo {
      public static void main(String[] args){
          // threads
          MyThread t1 = new MyThread();
          t1.start();

      }
}
// Thread class
class MyThread extends Thread {
     @Override
    public void run(){
         System.out.println(" Thread is running ");
     }
}
/*
t1.start(); -> jvm asks os to create ->

 */