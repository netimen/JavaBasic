package com.loftschool.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BadList badList = new BadList();
        badList.add("string");
        Integer number = (Integer) badList.get(0); // CRASH!

        MyList<String> myList = new MyList<>();
        myList.add("string");
        String string = myList.get(0);

        MyList<int> noWay = new MyList<>();
        MyList<Integer> intList = new MyList<>();

        String name = "Dmitry";
        Object name2 = name;
        MyList<Object> objList = myList;

        Map<String, List<Integer>> megaMap = new HashMap<>();

        genericMethod("");
        anotherGenericMethod("", new ArrayList<String>());
    }

    static <T> void genericMethod(T param) {

    }

    static <T, C extends Collection<T>> void anotherGenericMethod(T object, C container) {
        container.add(object);
    }
}
