package com.AccessModifier;

/**
 * Created by Nerd on 6/26/2017.
 */
public class AccessModifier {

        private  int hour = 1;
        private  int minute = 2;
        private  int second = 3;

/*
since the instance variable and local variable have same same
variable when called, the instance variable are called automatically.
the use of this keyword will make d local variable of the setTime mthd to be called

 */
        public void setTime(int hour, int minute, int second){
           this.hour = 4;
            this.minute = 5;
            this.second = 6;

        }
        public  String toMilitary(){

            return String.format("%02d:%02d:%02d",hour,minute,second);
        }
        public  String toString(){
            return String.format("%d:%02d:%02d %s",((hour==0 || hour == 12)? 12: hour%12),minute,second,(hour < 12 ? "AM":"PM"));
        }
    }

