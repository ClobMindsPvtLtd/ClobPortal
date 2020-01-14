package com.interview;

class MyThread extends Thread {
    MyThread() {
        System.out.print(" MyThread");
    }

    public void run() {
        System.out.print(" bar");
    }

    public void run(String s) {
        System.out.print(" baz");
    }
}

 class TestThreads {
    public static void main(String[] args) {


        int a= 10;

        Thread t = new MyThread() {
            public void run() {
                System.out.print(" foo");
            }
        };
        t.start();
    }
}