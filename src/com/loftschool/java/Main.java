package com.loftschool.java;

import com.loftschool.java.car.Car;
import com.loftschool.java.car.Truck;
import com.loftschool.java.car.Vehicle;
import com.loftschool.java.war.Tank;
import com.loftschool.java.war.Unit;

public class Main {
    public final String name = "Dmitry";

    public static void main(String[] args) {
        Car.Diagnostics diagnostics = new Car.Diagnostics();

        Engine engine = new Car.BestEngine();
        Car car = new Car();
        engine = car.new BestEngine();
    }
}
