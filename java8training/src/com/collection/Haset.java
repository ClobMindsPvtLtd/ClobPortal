package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Haset {


    public static void main(String[] args) {
        Employee emp =new Employee("farooq","software ",29,25000.00);
        Employee emp1=new Employee("viqar","testing",30,30000.00);
        Employee emp2=new Employee("viqar","testing",30,30000.00);
        Set<Employee> setList =new HashSet<>();
        setList.add(emp);
        setList.add(emp1);
        setList.add(emp2);

        setList.remove(emp1);
        setList.forEach(x-> System.out.println(x));


    }

}
