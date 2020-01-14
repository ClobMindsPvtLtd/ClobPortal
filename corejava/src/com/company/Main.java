package com.company;
import com.company.Student;
import com.company.Admin;
public class  Main{

    public static void main(String[] args) {





        Student[] arr = new Student[2];
        arr[0]=new Student("farooq",27,20);
        arr[1]=new Student("mohammed",26,20);

         Admin add = new Admin();
         add.add(arr);


    }



}
