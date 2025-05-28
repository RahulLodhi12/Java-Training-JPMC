package Session;

public class ThreadJoinDemo extends Thread {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.setName("wwe");
        thread.start(); //custom thread -> wwe thread

        thread.join(); //pause the execution of the current thread(main thread) until
        // the specified thread(wwe thread) (on which join() is called) completes its execution means "wwe" thread is dead.

        System.out.println(Thread.currentThread().getName() + " running.."); //Output not guarantee without join.

    }
}

class JoinDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running..");
    }
}

//"Runnable" Interface is Better than "Thread" Class —> because it allows extending another class.
//Example:
/*
class Animal {
    public void sound() {
        System.out.println("Animal is making a sound...");
    }
}

class Dog extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog is running in thread: " + Thread.currentThread().getName());
    }
}

public class RunnableWithInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Using method from the superclass
        dog.sound();

        // Running the dog as a thread
        Thread thread = new Thread(dog);
        thread.start();
    }
}
*/