package Assessment;

public class First100NumberSum_Wait_Notify_OR_Join {
    public static void main(String[] args) throws InterruptedException {
        Sum sum = new Sum();
        Thread thread = new Thread(sum);

        thread.start();
//        thread.join(); //with Join

        synchronized (sum){ //[main thread] sum object -> yeh block{}
            sum.wait();
        }

        System.out.println("Sum of First 100 Natural Numbers: " + sum.total); //yeh main thread mein chal rha hai.

    }
}

class Sum implements Runnable{
    int total;
    @Override
    public synchronized void run() { //[custom thread] sum object -> run()
        int total;
        for(int i=1;i<=100;i++){
            this.total+=i;
        }

        this.notify();
    }
}
