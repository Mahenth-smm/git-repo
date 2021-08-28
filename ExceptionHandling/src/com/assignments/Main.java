package com.assignments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a divisible program......."+"\n"+"Enter Numerator.....");
        int a = scanner.nextInt();
        System.out.println("Enter denominator.....");
        int b = scanner.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("A number divisible by zero is not possible......");
        }
        int [] array={1,2,3,4,5,6};

        try {
            System.out.println(array[array.length+1]);
        }catch (Exception e){
            System.out.println("Array index out of bound exception");
        }
    }
}
