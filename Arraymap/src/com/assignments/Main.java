package com.assignments;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array =  {1,2,3,4,5,6};
        System.out.println(
        Arrays.stream(array)
                .map(x-> x*x*x)
                .sum());
    }
}
