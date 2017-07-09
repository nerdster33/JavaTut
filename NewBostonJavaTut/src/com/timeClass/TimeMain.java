package com.timeClass;

import java.util.Scanner;

/**
 * Created by Nerd on 6/25/2017.
 */
public class TimeMain {
    public static void main(String[] args) {
        TimeClass mt = new TimeClass();
        Scanner input = new Scanner(System.in);
        mt.setTime(6,54,30);

        System.out.println(mt.toMilitary());
        System.out.println(mt.toString());

        mt.setTime(13,35,6);
        System.out.println(mt.toString());
    }
}
