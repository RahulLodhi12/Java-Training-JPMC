package Session;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        SleepDemo sleepDemo = new SleepDemo();
        Thread thread = new Thread(sleepDemo);
        thread.setName("tata");
        thread.start();



        Thread.sleep(5000); //"main" thread is in sleep for 5 sec.

        System.out.println(Thread.currentThread().getName() + " running..");
    }
}

class SleepDemo extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " custom thread running..");
        System.out.println(Thread.currentThread().getName() + " custom thread going to sleep..");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " custom thread wake up..");
    }
}
