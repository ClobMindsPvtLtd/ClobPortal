package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'fibonacci' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> fibonacci(int n) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(n).map(t-> t[0]).collect(Collectors.toList());
    }
    public static void main(String[] args){

List<Integer> fibonaccii=fibonacci(10);
        fibonaccii.forEach(x->System.out.println(x));
        // Write your code here

    }

}