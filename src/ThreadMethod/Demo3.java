package ThreadMethod;

public class Demo3 {
    public static void main(String[] args){

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=10; i++){
                System.out.println("T1  :" +i);
                Thread.yield();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=10; i++){
                System.out.println("T2  :" +i);
            }
        });
        t1.start();
        t2.start();
    }
}
/*
thread.yield() --> I am willing to give my cpu time to someone else with same priority

1 os can reject this
2 current thread does not go to  waiting  timid blocked
3 it is like a suggestion to the os
 */