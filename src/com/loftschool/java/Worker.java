package com.loftschool.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by d on 06.05.17.
 */
class Worker {
    private List<Integer> data = new ArrayList<>();

    void fillData() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                data.add(i);
                System.out.println("adding element " + i);
            }
        }
    }

    synchronized void printData() {
        System.out.println("DATA HAS " + data.size() + " ELEMENTS");

        for (int i = 0; i < data.size(); i++)
            System.out.println("printing element " + data.get(i));
    }
}
