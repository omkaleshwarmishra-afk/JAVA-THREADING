package ThreadMethod;

public class Demo1 {
      public static void main(String[] args){
          System.out.println("Main thread starts");

          try{
              Thread.sleep(2000);
          }
          catch(InterruptedException e){

          }
          System.out.println("Main thread ends");
      }
}
// Thread important methods
/*
Thread.sleep(milliseconds) -> TIMED_WAITING
Running -->  TIMED_WAITING --> RUNNABLE
 */