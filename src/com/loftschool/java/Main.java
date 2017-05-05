package com.loftschool.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        System.out.println(numbers.length);

        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            numbersList.add(i);

        for (int i = 0; i < numbersList.size(); i++)
            System.out.println(numbersList.get(i));

        for (Integer number : numbersList)
            System.out.println(number);

        System.out.println(numbersList.contains(22));

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Dmitry", 30);
        ages.put("Mom", 61);
        int myAge = ages.get("Dmitry");

        System.out.println(ages.isEmpty());
        System.out.println(ages.containsKey("Alex"));
        System.out.println(ages.containsValue(22));

        for (String name : ages.keySet())
            System.out.println(ages.get(name));

    }

}
