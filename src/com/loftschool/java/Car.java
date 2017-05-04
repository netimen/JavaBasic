package com.loftschool.java;

/**
 * Created by d on 04.05.17.
 */
public class Car {
    public static final int MAX_POSSIBLE_SPEED = 200;

    float speed;
    String name;
    static Engine[] engines = new Engine[10];

    Car() {
        Engine engine = new Engine() {
            @Override
            public void start() {
                speed = 10;
            }
        };
        engine.start();

        Engine bestEngine = new BestEngine();
        bestEngine.start();

        engines[0] = engine; // MEMORY LEAK!!!
        engines[1] = bestEngine; // MEMORY LEAK!!!
    }

    public class BestEngine implements Engine {
        String name;

        @Override
        public void start() {
            name = "Best";
            Car.this.name = "Best";
            speed = 20;

            Diagnostics diagnostics = new Diagnostics();
        }
    }

    static class Diagnostics {

        Diagnostics() {
            speed = 10;
            int maxSpeed = MAX_POSSIBLE_SPEED;

            Engine engine = new BestEngine();
            engine = engines[0];
        }
    }
}
