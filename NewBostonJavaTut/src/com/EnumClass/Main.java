package com.EnumClass;

/**
 * Created by Nerd on 6/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        for (EnumerationClass pple: EnumerationClass.values()){
            System.out.printf("%s\t\t%s\t\t%s\n",pple,pple.getDesc(),pple.getYear());

        }
    }
}
