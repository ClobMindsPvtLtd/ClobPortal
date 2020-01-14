package com.jdk8;



import gnu.trove.TObjectByteHashMap;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambda  {

static void print(){
    System.out.println("method refernce");
}

public static void biComsumer(int a, String age){
    System.out.println(a+age);
}

static Predicate<String> name(String s){

    return u -> u.startsWith(s);
}

static Disp<String> na(String s){
    return u ->{
        if(s != null){
            System.out.println("false");
        }
        return u.startsWith(s);
    };
}


    public static void main(String[] args) {


     /*   Disp d = () -> System.out.println("lambda test");
         Disp d1= Lambda::print;
         d1.display();
        d.display();*/

        System.out.println(Lambda.na("a"));

        BiConsumer<Integer,String> biConsumer =(age,name) ->{
            System.out.println(age+name);
        };
   biConsumer.accept(30,"farooq");





    }


}
