class MThread extends Thread {
    MThread(String message) {
        setName(message);
    }

    public void run() {
        try {
            for (int i = 100; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {}
    }
}

public class SleepThread {
    public static void main(String[] args) {
        MThread t1 = new MThread("Madarchod");
        System.out.println("Thread Name is: " + t1.getName());
        t1.start();

        try {
            Thread.sleep(6000);
            t1.setName("Maakichut");
            System.out.println("After Changing the Thread name: " + t1.getName());
        } catch (InterruptedException e) {}
    }
}
