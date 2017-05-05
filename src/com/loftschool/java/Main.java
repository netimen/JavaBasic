package com.loftschool.java;

import java.io.IOException;

// TODO please read http://developer.alexanderklimov.ru/android/java/exception.php
public class Main {

    public static void main(String[] args) {
        String name = null;
//        int len = name.length();
//        if (name != null)
//            name.toUpperCase();

        try {
            importantWork("");
            System.out.println("do something important");
        } catch (NullPointerException exception) {
            exception.printStackTrace();
            System.out.println("null");
//        } catch (IllegalArgumentException exception) {
//            System.out.println("illegal argument!");
//        } catch (Exception exception) {
//            System.out.println("Some other error");
        } finally {
            System.out.println("do in all cases");
        }

        otherWork();

        try {
            readBigFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void importantWork(String param) {
        if (param == null)
            throw new NullPointerException();

        if (param.equals(""))
            throw new IllegalArgumentException("param can't be empty string!!!");

        throw new ArithmeticException();
    }

    static void otherWork(){
        throw new MyException();
    }

    static void readBigFile() throws IOException {
        throw new IOException();
    }

}
