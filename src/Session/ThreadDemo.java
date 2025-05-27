package Session;

import java.util.Scanner;

public class ThreadDemo extends Thread {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        ThreadDemo threadDemo = new ThreadDemo();
//        threadDemo.setName("rahul");
//        threadDemo.start(); //need to go to the running phase.
//
//        System.out.println(Thread.currentThread().getName()); //main thread -> always at running phase when the main() loaded.


        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" running..");
//    }

}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}
