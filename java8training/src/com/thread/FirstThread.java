package com.thread;

import java.io.Console;
import java.io.IOException;

public class FirstThread implements Runnable {




    @Override
    public void run() {
        System.out.println("Thread is running");

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static void main(String[] args) {


        FirstThread firstThread= new FirstThread();
        FirstThread firstThread1=new FirstThread();
        Thread t1=new Thread(firstThread);
        Thread t2=new Thread(firstThread1);

        t1.start();
       
        System.out.println(n);
        t2.start();


    }

}
