package com.AccessModifier;

/**
 * Created by Nerd on 6/26/2017.
 */
public class AccessModifierMain {
    public static void main(String[] args) {
        AccessModifier ac = new AccessModifier();

        System.out.println(ac.toMilitary());
        System.out.println(ac.toString());

        // the value changes cuz of the this keyword used in the setTime methd
        ac.setTime(13,27,6);
        System.out.println(ac.toMilitary());
        System.out.println(ac.toString());

    }
}
