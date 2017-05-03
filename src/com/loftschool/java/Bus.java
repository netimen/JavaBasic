package com.loftschool.java;

/**
 * Created by d on 03.05.17.
 */
public class Bus extends Car {
    int seatsCount;

    Bus(int year, int seatsCount) {
        super(year);
        this.seatsCount = seatsCount;
    }
}
