package GameDevTut_01;

public class GameDevTutOne{
    public static void main(String[] args) {
        Thread t1=new Thread(new tutThread("one"));
        Thread t2=new Thread(new tutThread("two"));
        Thread t3=new Thread( new tutThread("three"));

        t1.start();
        t2.start();
        t3.start();
    }
}

