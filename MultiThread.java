import java.util.*;

class RandomNumber extends Thread {
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100);
            System.out.println("Generated: " + num);
            Thread t = (num % 2 == 0) ? new Thread(() -> System.out.println("Square: " + num * num))
                                      : new Thread(() -> System.out.println("Cube: " + num * num * num));
            t.start();
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        new RandomNumber().start();
    }
}
