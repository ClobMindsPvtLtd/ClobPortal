package com.company;


interface A{
    void display();
}
public class LambdaTest {

    public static void main(String[] args) {
        A a = () -> System.out.println("hello");

    a.display();
    }


}
