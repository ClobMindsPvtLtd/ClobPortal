package com.jdk5;
import  static  java.lang.System.*;
public  class VariableTypeArgumnet {

    public enum WeeksDays{ MONDAY,TUESDAY,WEDNESDAY,

    }




    public static void varArgs(String ... values){
        for(String s:values){

            out.println(s);
        }
        for (WeeksDays s: WeeksDays.values()) {
            out.println(s);
        }

    }


    public static void main(String[] args) {

        VariableTypeArgumnet.varArgs("hell","hi"+WeeksDays.valueOf("MONDAY"));

    }

}
