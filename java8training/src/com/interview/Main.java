package com.interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class  Filter{

    static Predicate<String> name(String s){
        return  u ->{
            if(s != null){
                System.out.println("cannot apply prefix its null");
            }
            return u.startsWith(s);
        };
    }
}

/*
class mapper{

    static Function<String,Characterscount> get(){
        retun
    }
}
*/

 class Main {


    public static void main(String[] args) {

        List<String> names= Arrays.asList("ahhhhh","aasssthe","atast");
     Long count =   names.stream()
                .filter(Filter -> Filter.startsWith("a"))
                .sorted()
                .count();
               // .forEachOrdered(System.out::println);
        System.out.println(count);
    }
}
