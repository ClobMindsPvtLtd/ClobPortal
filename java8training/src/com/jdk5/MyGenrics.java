package com.jdk5;

public class MyGenrics<T> {

    T obj;

    void add(T obj){
        this.obj=obj;
    }
 T getObj(){
        return obj;
 }

}
