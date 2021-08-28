package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limits...");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        List<String> list = new ArrayList<>();
        for (int i =0;i<n;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Type your Strings here...");
            String word = input.nextLine();
            strings[i] = word;
            list.add(strings[i]);

        }
        System.out.println(Arrays.toString(strings));
        boolean check = true;
        while(check){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter index number to remove..");
            int index = input2.nextInt();
            try {
                if(strings[index-1] == null){
                    throw new Exception();
                }else{
                  list.remove(index-1);
                    System.out.println(list);
                    if(list.size()==0){
                        System.out.println("Array is Empty....");
                        check = false;
                    }
                    }
            } catch (Exception exception) {
                System.out.println("Invalid index..");
            }
        }

    }
}
