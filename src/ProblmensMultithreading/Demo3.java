package ProblmensMultithreading;

public class Demo3{
public static void main(String[] args){
    int x = 0;
    boolean flag = false;

    Thread t1 = new Thread(() ->{
//        x = 10;
//        flag = true;

    });
    Thread t2 = new Thread(() ->{
        if(flag == true){
            System.out.println(x);
        }

    });

    }
}
 /*
 ordering problem ->optimization , reordering
 synchronised , volatile , proper locking mechanism
  */