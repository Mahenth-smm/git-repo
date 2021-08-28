package com.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] arr1= {"Jhon","Thomas","George"};
        String[] arr2 ={"Das","Krishna","Dev"};
        int a = arr1.length;
        int b = arr2.length;
        // concat using for loop
        String[] arr3 = new String[a+b];
        for (int i =0;i<a;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<b;i++){
            arr3[a+i]=arr2[i];
        }
        for(int i =0;i<a+b;i++){
            System.out.println(arr3[i]);
        }
        System.out.println(Arrays.toString(arr3));
     // concat using while loop
     String[] arr4 = new String[a+b];
     int i =0;
     while (i<a){
         arr4[i]=arr1[i];
         i++;
     }
     int j =0;
     while(j<b){
         arr4[a+j]=arr2[j];
         j++;
     }
     int k =0;
     while (k<a+b){
         System.out.println(arr4[k]);
         k++;
     }
        System.out.println(Arrays.toString(arr4));
     //concat using do while loop
        String[] arr5 = new String[a+b];
        int count1 = 0;
        do{
            arr5[count1]= arr1[count1];
            count1++;
        }while(count1<a);

        int count2 = 0;
        do{
            arr5[count2+a]= arr2[count2];
            count2++;
        }while(count2<b);

        int count3 = 0;
        do{
            System.out.println(arr5[count3]);
            count3++;
        }while(count3<a+b);
        System.out.println(Arrays.toString(arr5));
        // concat and displaying  using for each loop
        String[] arr6 = new String[a+b];
        int num1 = 0;
        for (String elements: arr1) {
            arr6[num1] = elements;
            num1++;
        }
        int num2 =0;
        for (String elements :arr2) {
                arr6[a+num2]= elements;
                num2++;
            }
        int num3 =0;
        for (String elements2:arr6) {
            System.out.println(elements2);
        }

        System.out.println(Arrays.toString(arr6));


    }
}
