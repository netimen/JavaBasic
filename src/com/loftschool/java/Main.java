package com.loftschool.java;

public class Main {

    public static void main(String[] args) {
        int yearInCentury = 2017 % 100; // 17
        int number = 3 + 2 * (5 + 1);
        int sum = number++ + 1;
        System.out.println("number: " + number + " sum: " + sum);

        boolean equals = sum == number;
        boolean equals2 = sum-- == number;
        boolean equals3 = --sum == number;
        boolean notEquals = sum != number;
        boolean greaterOrEquals = sum >= number;
        System.out.println("eq: " + equals + " eq2: " + equals2 + " eq3: " + equals);

        boolean isMale = true, isStudent = true, isYoung = true;
        boolean isFemale = !isMale; // false
        boolean goesArmy = isMale && !isStudent && isYoung;

        boolean isPhone = true, isTablet = false, hasAndroid = true, hasIOS = false;
        boolean isAndroidPhone = isPhone && hasAndroid; // true
        boolean isAppleDevice = isPhone || isTablet && hasIOS; // true!!!
        System.out.println("isAppleDevice: " + isAppleDevice);
        isAppleDevice = (isTablet || isPhone) && hasIOS;
        System.out.println("isAppleDevice: " + isAppleDevice);

        boolean isSomething = isPhone && ((number++ > 13) || --sum + 11 != 34);
        System.out.println("isSomething: " + isSomething);
    }
}
