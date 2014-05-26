package GameDevTut_01;

import java.util.Random;

public class GameDevTutOne{
    public static void main(String[] args) {
        Thread t1=new Thread(new GameDevTutOne_Thread("one"));
        Thread t2=new Thread(new GameDevTutOne_Thread("two"));
        Thread t3=new Thread(new GameDevTutOne_Thread("three"));

        t1.start();
        t2.start();
        t3.start();
    }
}

