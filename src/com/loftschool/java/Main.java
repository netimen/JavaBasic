package com.loftschool.java;

public class Main {

    public static void main(String[] args) {
        int money = 5000, price = 2000;
        if (money > price)
            System.out.println("can buy!");
        else
            System.out.println("can't buy :(");

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("so cool!");
            System.out.println("let's go for a walk!");
        }

        int repetitionCount = 2;
        while (repetitionCount > 0) {
            System.out.println("doing something important!");
            repetitionCount--;
        }

        while (repetitionCount-- > 0)
            System.out.println("doing something important!");

        for (int i = 0; i < 10; i++)
            System.out.println("doing something important!");
    }
}
