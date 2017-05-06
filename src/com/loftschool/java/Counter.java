package com.loftschool.java;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by d on 06.05.17.
 */
class Counter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int get() {
        return counter;
    }

    private AtomicInteger atomicCounter = new AtomicInteger();

    void threadSafeCode() {
        int value = atomicCounter.incrementAndGet();
    }
}
