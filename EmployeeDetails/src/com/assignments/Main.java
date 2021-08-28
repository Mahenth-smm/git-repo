package com.assignments;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
    int rollNumber;
    String firstName;
    String secondName;
    int age;
    int salary;
    String designation;
  public Employee(int rN,String fN,String sN,int age, int salary,String designation) {
      this.rollNumber = rN;
      this.firstName = fN;
      this.secondName = sN;
      this.age = age;
      this.salary = salary;
      this.designation = designation;
  }
  public  void display(){
      System.out.println("Roll Number  : "+rollNumber);
      System.out.println("Name  : "+ firstName+" "+secondName);
      System.out.println("Age  : "+age+ "\n" +"Salary  : "+ salary+ "\n" +"Designation  : "+designation+"\n");
}
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        boolean check = true;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter roll number....");
            int rN = scanner.nextInt();
            System.out.println("Enter first name...");
            String fN = scanner.next();
            System.out.println("Enter second name...");
            String sN = scanner.next();
            System.out.println("Enter age ...");
            int age = scanner.nextInt();
            System.out.println("Enter salary...");
            int salary = scanner.nextInt();
            System.out.println("Enter designation");
            String designation = scanner.next();

            list.add(new Employee(rN,fN,sN,age,salary,designation));
            System.out.println("Type 'a' to add more employees & click any other key to exit..");
            Scanner input = new Scanner(System.in);
            String a = input.next();
            if(!a.equals("a")){
                break;
            }
        }
        for (Employee details : list) {
            details.display();
        }
    }
    }

