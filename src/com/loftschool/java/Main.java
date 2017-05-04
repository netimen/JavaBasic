package com.loftschool.java;

import com.loftschool.java.car.Car;
import com.loftschool.java.car.CarWorkshop;
import com.loftschool.java.car.Truck;
import com.loftschool.java.war.Tank;

public class Main {
    public static final int SECONDS_IN_DAY = 60 * 60 * 24;

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.speed = 50; // protected!
        car.year++; // package-local!

        CarWorkshop.repair(car);
        Car.drive(); // drive() isn't static!

        new Tank().drive(); // constructor is package-local
        new Truck().drive(); // class is package-local

        int[] integers = new int[50];
        for (int i = 0; i < integers.length; i++)
            integers[i] = i * SECONDS_IN_DAY;
    }
}
