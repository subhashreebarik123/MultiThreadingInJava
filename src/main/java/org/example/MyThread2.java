package org.example;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Now the thread is running");
    }

    public static void main(String[] args) {
        Runnable r1 = new MyThread2();

        Thread th1 = new Thread(r1,"My thread ");

        th1.start();

        String str = th1.getName();
        System.out.println(str);
            }
        }

