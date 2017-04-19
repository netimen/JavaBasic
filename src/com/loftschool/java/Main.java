package com.loftschool.java;

public class Main {

    public static void main(String[] args) {
        boolean isGood = true;
        if (isGood)
            System.out.println("do something good");
        else
            System.out.println("do something bad");
        System.out.println("do something fun");

        boolean otherCondition = false;
        if (isGood && otherCondition) {
            System.out.println("do something good");
            System.out.println("do something very good");
        }

        int repeatCount = 2;
        while (repeatCount-- > 0)
            System.out.println("do something while...");

        do
            System.out.println("do something while...");
        while (repeatCount-- > 0);

        for (int i = 0; i < 10; i++)
            System.out.println("iteration number " + i);

        for (int i = 0; i < 10; i--)
            System.out.println("INFINITE LOOP!!!");
    }
}
