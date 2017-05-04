package com.loftschool.java;

import com.loftschool.java.car.Car;
import com.loftschool.java.car.Truck;
import com.loftschool.java.car.Vehicle;
import com.loftschool.java.war.Tank;
import com.loftschool.java.war.Unit;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit();
        Vehicle vehicle = new Vehicle();

        Tank tank = new Tank();
        tank.receiveCommand();
        tank.move();
        tank.shoot();
    }
}
