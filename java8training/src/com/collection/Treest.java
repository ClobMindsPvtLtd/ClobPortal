package com.collection;

import java.util.TreeSet;

public class Treest {

    public static void main(String[] args) {


        Employee emp =new Employee("farooq","software ",29,25000.00);
        Employee emp1=new Employee("viqar","testing",30,30000.00);

        TreeSet<Employee> treeSet=new TreeSet<>();

        treeSet.add(emp);
        treeSet.add(emp1);

        treeSet.forEach(p-> System.out.println(p));
    }
}
