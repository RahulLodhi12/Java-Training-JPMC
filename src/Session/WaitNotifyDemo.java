package Session;

//Note: Both wait() and notify() need to be inside the synchronized block
public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        Work work = new Work(); //main thread - represents
        Thread thread = new Thread(work); //custom thread

        thread.setName("tcs");
        thread.start(); //this custom thread("tcs") starts and dead on this only.

        //this lock on "work" object -> yeh block{} acquire
        synchronized (work){ //synchronized(lockObject)
            System.out.println(Thread.currentThread().getName() + " gets the lock...");
            System.out.println(Thread.currentThread().getName() + " about to go waiting...");
            work.wait(); //main goes to sleep and released the resources
            System.out.println(Thread.currentThread().getName() + " gets back the lock...Carries on with it's execution");
        }

    }
}

class Work implements Runnable{
    @Override
    public synchronized void run() { //work object -> run() acquire
        System.out.println(Thread.currentThread().getName()+" custom thread running..");
        this.notify();
        System.out.println(Thread.currentThread().getName()+" custom thread send notification to wake up..");
    }
}

//Output 2:
/*
tcs custom thread running..
tcs custom thread send notification to wake up..
main gets the lock...
main about to go waiting...
*/

//(main thread will hang here because notify() already happened)
//👉 This leads to a hang since main waits after notify() already occurred — a lost notification.