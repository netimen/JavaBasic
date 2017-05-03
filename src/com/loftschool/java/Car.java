package com.loftschool.java;

/**
 * Created by d on 03.05.17.
 */
class Car {
    int year;
    float speed = 0;

    Car(int year) {
        this.year = year;
    }

    void drive() {
        speed = 100;
    }
}
