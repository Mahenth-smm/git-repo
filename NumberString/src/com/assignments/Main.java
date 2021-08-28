package com.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String sentence = "She is is beautiful beautiful girl";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your string here");
        String sentence = scanner.nextLine();
        HashMap<String, Integer> hm = new HashMap<String,Integer>();
        String [] words= sentence.split(" ");
        for (String word: words) {
               Integer i = hm.get(word);
            if(hm.get(word) == null){
            hm.put(word,1);
            }else{
                hm.put(word,i+1);
            }
        }hm.forEach((k,v) ->System.out.println("The string '"+k+"' repeats " +v+ " time.."));

    }
}
