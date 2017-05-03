package com.loftschool.java;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.year = 2010;
        myCar.drive();

        Car someCar = myCar;
        someCar.year = 2011; // now myCar.year = 2011

        int newYear = 2017;
        Integer myCarPrice = 10000;
        repairCar(myCar, newYear, myCarPrice); // now myCar.year = 2017 & someCar.year = 2017; myCarPrice = 10000
    }

    static void repairCar(Car car, int year, Integer carPrice) {
        car.year = year;

        car = new Car();
        car.year = 2013; // myCar.year = 2017

        year += 3; // newYear = 2017
        carPrice += 1000; // carPrice = carPrice + 10000; myCarPrice = 10000
    }
}
