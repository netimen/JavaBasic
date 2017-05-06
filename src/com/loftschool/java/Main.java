package com.loftschool.java;

public class Main {

    private static Worker worker = new Worker();

    // TODO please read http://developer.alexanderklimov.ru/android/java/thread.php
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println("Thread " + i);
            }
        });
        thread.start();

        for (int i = 0; i < 100; i++)
            System.out.println("Main " + i);

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker.fillData();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker.printData();
            }
        }).start();
    }

}
