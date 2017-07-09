package com.constructor;

/**
 * Created by Nerd on 6/27/2017.
 */
public class CompositionConstruct {

    private  String name;
    private  potpieConstuct birthday; // from potpieConstruct class.java

    public CompositionConstruct(String theName, potpieConstuct theDate){
        name = theName;
        birthday = theDate;
    }

    public  String toString(){
        return  String .format("My name is %s, my birthday is %s",name,birthday.toString());
    }
}
