package com.company;

public interface Person {

  default void test(){
      System.out.println("printing from interface");
  }
   default void  print(){
    System.out.println("default method other");
   };


}
