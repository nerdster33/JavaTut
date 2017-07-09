package com.constructor;

/**
 * Created by Nerd on 6/20/2017.
 */
public class constructorClass {

    public  constructorClass(String name){
        girlName = name;
    }
    public  void  simpleMessage(String name){

        System.out.println("Hello, "+ name);
    }

    private  String girlName;

    public  void setName(String  name){
        girlName = name;

    }
    public  String getName(){

        return  girlName;

    }
    public  void  saying(){

        System.out.printf("The name of my first princess is %s\n", getName());

    }
}
