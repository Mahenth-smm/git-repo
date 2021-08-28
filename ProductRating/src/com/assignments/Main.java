package com.assignments;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, List<String>> hm1 = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type Limit of product here.");
        int len = input.nextInt();

        for(int i =1;i<=len;i++){
            List<String> list1 = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Product name");
            String product = scanner.nextLine();
            System.out.println("Enter rating of product");
            int rating = scanner.nextInt();
            if(hm1.containsKey(rating)){
                List<String> list2 = hm1.get(rating);
                list2.add(product);
                hm1.put(rating,list2);
              //  System.out.println(hm1);
            }else {
                list1.add(product);
                hm1.put(rating,list1);
               // System.out.println(hm1);
            }
        }
        for (int i= 1 ; i<=5 ; i++){
          //  System.out.println(i+" : "+hm1.get(i));
            if(hm1.get(i)==null){
                hm1.put(i, Collections.singletonList("no product"));
                System.out.println(i+" : "+hm1.get(i));
            }else{
                System.out.println(i+" : "+hm1.get(i));
            }
        }
    }
}
