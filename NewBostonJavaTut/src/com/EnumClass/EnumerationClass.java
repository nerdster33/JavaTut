package com.EnumClass;

/**
 * Created by Nerd on 6/27/2017.
 */
public enum EnumerationClass { // enum are constant which are also obj
    Nerd("Geek","28"),
    Niffy("Cutie","5"),
    Fefe("Funny","2"),
    Debby("Hardworking", "25"),
    LilSissy("Miser","20"),
    BigMama("Iya","40"),
    DonClarke("Hustler","21");

    private final String desc;
    private final String year;

    EnumerationClass(String descrption,String age){
        desc = descrption;
        year = age;
    }

    public  String getDesc(){
        return  desc;
    }

    public  String getYear(){
        return  year;
    }


}
