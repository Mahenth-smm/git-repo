package com.assignments;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	//String sentence ="Java is is an object-oriented programming programming language";
	Scanner scanner = new Scanner(System.in);
        System.out.println("Type your sentences Here.....");
	String sentence = scanner.nextLine() ;
	Set<String> word = new LinkedHashSet<>();
	String[] wordsAll = sentence.split(" ");
        System.out.println(Arrays.toString(wordsAll));

    for(String e: wordsAll){
        word.add(e);
    }
    for (String e : word){
        System.out.print(" "+e+" ");
    }
    }
}
