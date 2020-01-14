package com.company;

public class Admin implements Person,Testale{

    public void add(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
            arr[i].print();
        }
    }

    @Override
    public void print() {

    }

    @Override
    public void test() {
        Person.super.test();
    }
}
