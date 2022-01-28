package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String city;
        city = "Columbus";
        int zipcode = 43215;
        int dailyHighs[] = {32, 25, 27, 40, 45};

        double total = 0;

        for (int i = 0; i < dailyHighs.length; i++) {
            total = total + dailyHighs[i];
        }
        double average = total / dailyHighs.length;

        System.out.println("City: " + city + " Zip Code: " + zipcode + " Average High Temperature: " + average);

    }
}
