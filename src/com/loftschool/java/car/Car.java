package com.loftschool.java.car;

/**
 * Created by d on 03.05.17.
 */
public class Car implements Vehicle {
    protected float speed = 0;

    @Override
    public void drive() {
        speed = 100;
    }
}
