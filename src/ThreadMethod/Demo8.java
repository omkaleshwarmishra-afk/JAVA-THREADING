package ThreadMethod;

public class Demo8 {
    public static void main(String[] args){
      Thread t1 = new Thread(() ->{
          while(true){
              System.out.println("Running...");
          }
      });

      t1.setDaemon(true);
      t1.start();
       try{
           Thread.sleep(1);
       }
       catch (Exception e){}

    }
}
 /*
  Daemon Threads --> Background running threads
  --> stop immediately

  Threads --> User threads , Daemon threads


  */