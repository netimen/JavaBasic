package com.loftschool.java.car;

/**
 * Created by d on 04.05.17.
 */
public class CarWorkshop {
    public static void repair(Car car) {
        car.year++;

        if (car instanceof Truck) {
            Truck truck = (Truck) car;
            truck.maxWeight += 10; // private!
        }
    }
}
