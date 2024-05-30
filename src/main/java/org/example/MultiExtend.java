package org.example;

public class MultiExtend implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MultiExtend multiExtend = new MultiExtend();

        Thread thread1 = new Thread(multiExtend);
        Thread thread2 = new Thread(multiExtend);
        Thread thread3 = new Thread(multiExtend);
        Thread thread4 = new Thread(multiExtend);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
