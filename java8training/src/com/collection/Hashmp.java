package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmp {

    public static Map<String,Object> mapFunction(Employee em){
   Map<String,Object> details=new HashMap<>();

   details.put("Age",em.getName());
   details.put("Salary",em.getSalary());


        return details;
    }

    public static void main(String[] args) {
        Employee emp =new Employee("farooq","software ",29,25000.00);
        Employee emp1=new Employee("viqar","testing",30,30000.00);
        Map<String, Integer> map =new HashMap<>();
        map.put("viqar",1);
        map.put("tarooq",2);
        map.put("farooq",3);
        System.out.println(map.entrySet());
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

mapFunction(emp).entrySet()
        .stream()
        .forEach(System.out::println);




    }

}
