package com.jdk5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {

   public static <E> void addd(E[] elements){
       for (E Elements:elements) {
           System.out.println(elements);
       }
   }

   public static <T> void display(T s,T k){
       System.out.println("displaying the parameter" +s+k);
   }

   public static void exception() throws IOException {
       try(FileOutputStream fileOutputStream=new FileOutputStream(""))
       {
           int a=1/0;
           System.out.println(a);

       }catch (FileNotFoundException| ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException e ){
           System.out.println(e.getMessage());
       }
   }

    public static void main(String[] args) throws IOException {

       exception();

        display(2,"string");

        MyGenrics<String> myGenrics=new MyGenrics<>();

        myGenrics.add("hello");

        System.out.println(myGenrics.getObj());


    }
}
