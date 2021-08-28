package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limits......");
        int n = scanner.nextInt();
        int[] num = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number");
            int number = input.nextInt();
            num[i] = number;
        }
        System.out.println(Arrays.toString(num));
        for (Integer e : num) {
            try {
                if (list.contains(e)) {
                    throw new Exception();
                } else {
                    list.add(e);
                }
            } catch (Exception exception) {
                System.out.println("Number Repeated  : " + e);
            }
        }
    }
}