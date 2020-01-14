package com.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Arraylist {


    public static void main(String[] args) {

        Employee emp =new Employee("viqar","software ",29,35000.00);
        Employee emp1=new Employee("farooq","testing",30,30000.00);
        List<Employee> list=new ArrayList<>();

        list.add(emp);
        list.add(emp1);
       // list.set(0,emp1);

        Comparator<Employee> employeeComparator=Comparator.comparing(Employee::getSalary);
            Collections.sort(list,employeeComparator);

        list.forEach(name -> System.out.println(name));

       /* Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
   List<Integer> list1 = list.stream()
              .filter(age -> age.getAge() <30)
              .map(age -> age.getAge())
              .collect(Collectors.toList());

     list1.forEach(ll -> System.out.println(ll));
    }
}
