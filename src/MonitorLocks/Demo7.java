package MonitorLocks;

public class Demo7 {
    public static void main(String[] args){

        Test2 test = new Test2();

        Thread t1 = new Thread(() ->  Test2.m1());

        Thread t2 = new Thread(() -> test.m2());

        t1.start();
        t2.start();

    }
}
class Test2 {

    static void m1(){
       synchronized (Test2.class) {
           System.out.println("m1 entered");
           try {
               Thread.sleep(2000);
           } catch (Exception e) {
           }
           System.out.println("m1 exit");
       }
    }
     void m2() {
         synchronized (Test2.class) {
             System.out.println("m2 entered");
             try {
                 Thread.sleep(2000);
             } catch (Exception e) {
             }
             System.out.println("m2 exit");
         }
     }
}
