package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

class Reverse{
  String  wordOriginal;
    public Reverse(String wordOriginal) {
        this.wordOriginal=wordOriginal;
    }
    public void display(String wordOriginal){
        int len = wordOriginal.length();
        Character[]  wordReverse = new Character[len];
        for (int i =0; i<len;i++){
            wordReverse[len-i-1] =wordOriginal.charAt(i);
        }
        for(char c: wordReverse){
            System.out.print(c);
        }
    }

    public String getWordOriginal() {
        return wordOriginal;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your words here......");
        String wordOriginal = scanner.nextLine();
        Reverse rev = new Reverse(wordOriginal);
        rev.display(wordOriginal);
    }
}
