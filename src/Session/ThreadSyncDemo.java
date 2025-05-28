package Session;

public class ThreadSyncDemo {
    public static void main(String[] args){
        SyncDemo syncDemo = new SyncDemo();

        Thread thread1 = new Thread(syncDemo);
        Thread thread2 = new Thread(syncDemo);

        thread1.setName("tcs1");
        thread2.setName("tcs2");


        thread1.start();
        thread2.start();


//        System.out.println(Thread.currentThread().getName() + " running..");
    }
}

class SyncDemo implements Runnable{
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " running..");

        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + " idx: " + i);
        }

        System.out.println(Thread.currentThread().getName() + " ending..");
    }
}