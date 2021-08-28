package com.assignments;

public class Member {
    String name;
    int age;
    long phoneNumber;
    String address;
    int salary ;
     void printSalary() {
         System.out.println("Name  :  "+name);
         System.out.println("Age  :  "+age);
         System.out.println("Salary : "+salary);
         System.out.println("Phone Number  :  "+ phoneNumber );
         System.out.println("Address  :  "+ address);
    }
}
class  Employee extends Member{
    String specialization;
    void otherDetails(){
        System.out.println("Specialization  :  "+ specialization);
    }
}
class Manager extends Member{
    String department;
    void otherDetails(){
        System.out.println("Department  :  "+ department);
    }

    }
