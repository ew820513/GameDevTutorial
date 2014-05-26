package GameDevTut_01;

import java.util.Random;

public class tutThread implements Runnable {
    String name;
    int time;
    Random r = new Random();

    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {
        }
    }

    public tutThread(String s) {
        this.name = s;
        this.time = r.nextInt(999);
    }
}
