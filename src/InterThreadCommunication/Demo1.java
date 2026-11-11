package InterThreadCommunication;

public class Demo1 {
    public static void main(String[] args){
        Box box = new Box();

        Thread t1 = new Thread(() -> box.producer(10));

        Thread t2 = new Thread(() -> box.consumer());
        
        t1.start();
        t2.start();

    }
}

class Box{
    Integer item;
    Boolean flag = false;

    void producer(int value){
        item = value;
        flag = true;
        System.out.println("producer " +item);
    }
    void consumer() {
        System.out.println("Consumer " +item);
        item = null;
        flag = false;
    }
}