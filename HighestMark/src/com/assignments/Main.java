package com.assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for (int i = 1;i<=2;i++){
            System.out.println("Details of Student "+i);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type mark of English....");
                int markE = scanner.nextInt();
                System.out.println("Type mark of Maths....");
                int markM = scanner.nextInt();
                System.out.println("Type marks of Graphics...");
                int markG = scanner.nextInt();
                if(!hm1.containsKey("english")){
                    hm1.put("english",markE);
                    hm1.put("maths",markM);
                    hm1.put("graphics",markG);
                }else{
                    hm2.put("english",markE);
                    hm2.put("maths",markM);
                    hm2.put("graphics",markG);
            }
        }
        System.out.println(hm1);
        System.out.println(hm2);
        for (String key: hm1.keySet()) {
                if(hm1.containsKey(key));
                if( hm1.get(key)==hm2.get(key)){
                    System.out.println("Both student got equal marks in "+key);
                }else if (hm1.get(key)>hm2.get(key)){
                    System.out.println("Student 1 got high marks in "+key);
                }else{
                    System.out.println("Student 2 got high marks in "+key);
                }
        }
    }
}
