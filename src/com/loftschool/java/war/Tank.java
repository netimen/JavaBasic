package com.loftschool.java.war;

import com.loftschool.java.car.Car;

/**
 * Created by d on 04.05.17.
 */
public class Tank extends Car { // Tank is final class - you can't extend it!
    Tank() {
        year = 2017; // package-local!
        speed = 50;
    }

    @Override
    public void drive() {
        super.drive();
        speed -= 20;
    }

    public final void shoot() { // you can't override method shoot
    }
}
