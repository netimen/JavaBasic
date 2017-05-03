package com.loftschool.java;

/**
 * Created by d on 03.05.17.
 */
class Car {
    int year;
    float length, width;
    float speed = 0;

    Car() {
        year = 2017;
        length = 4.2f;
        width = 1.5f;
    }

    Car(float length, float width, int year) {
        this.length = length;
        this.width = width;
        this.year = year;
    }

    void drive() {
        speed = 100; // this.speed = 100
    }
}
