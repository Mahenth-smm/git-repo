package com.assignments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your sentence here....");
        String s = scanner.nextLine();
        String[] elements = s.split(" ");
        for (String e:elements) {
            System.out.print(e);
        }
    }
}
