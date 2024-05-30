package org.example;

public class Multi extends Thread{

    public void run(){
        System.out.println("Inside thread class:"+Thread.currentThread());
    }

    public static void main(String[] args) {
        Multi multi = new Multi();
        multi.start();
    }
}
