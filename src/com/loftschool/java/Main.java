package com.loftschool.java;

public class Main {

    static void printPrice(int price) {
        System.out.println("Price is " + price);
        System.out.println("Our price is the best");
    }

    static int applyDiscount(int price, int discountPercent) {
        int newPrice = price * (100 - discountPercent) / 100;
        return newPrice;
    }

    static int applyDiscount(int price, int discountPercent, boolean oldClient) {
        percent++; // ERROR
        if (oldClient)
            discountPercent *= 2;

        return applyDiscount(price, discountPercent);
    }

    public static void main(String[] args) {
        int mySalary = 5000;
        if (mySalary > 1000) {
            int myMoney = mySalary;
            myMoney -= 500; // tickets to India
            if (myMoney > 500) {
                myMoney -= 100; // new shoes
                myMoney -= 10; // new T-shirt
            }
        }
        myMoney -= 200; // ERROR

        System.out.println("Price is " + 30);
        System.out.println("Our price is the best");

        System.out.println("Price is " + 50);
        System.out.println("Our price is the best");

        printPrice(30);
        printPrice(50);

        int price = 30, percent = 25;
        int myPrice = applyDiscount(price, percent, true);
        System.out.println(percent); // still 25!!!
    }

}
