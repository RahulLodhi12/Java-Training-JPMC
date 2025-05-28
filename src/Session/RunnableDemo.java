package Session;

public class RunnableDemo {
    public static void main(String[] args){
        ThreadWork threadWork = new ThreadWork(); //Runnable task
        Thread thread = new Thread(threadWork); //calls Thread constructor with Runnable task parameter.
        thread.setName("tcs");
        thread.start(); //start() method is of "Thread" class

        System.out.println(Thread.currentThread().getName() + " running.."); //Output is not guarantee.
    }
}

class ThreadWork implements Runnable{ //Runnable interface is functional interface -> Has single abstract method.
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" running..");
    }
}
