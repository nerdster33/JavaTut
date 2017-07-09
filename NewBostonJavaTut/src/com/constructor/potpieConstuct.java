package com.constructor;

/**
 * Created by Nerd on 6/27/2017.
 */
public class potpieConstuct {
    private  int month;
    private int day;
    private  int year;

    public  potpieConstuct(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s\n",this );

    }

    public  String toString(){
        return  String.format("%d/%d/%d",month,day,year);
    }
}
