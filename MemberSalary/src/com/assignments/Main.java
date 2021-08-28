package com.assignments;


public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.name = "Jhon Thomas";
        manager1.age = 34;
        manager1.phoneNumber= 98765432134L;
        manager1.address = "No.123, Abc street , Def.  ";
        manager1.salary = 35000;
        manager1.department = "Administration ";


        Employee employee1 = new Employee();
        employee1.name="George";
        employee1.age = 24;
        employee1.phoneNumber = 88959453234L;
        employee1.address = "No.456, Xyz street ,  Qwe. ";
        employee1.salary = 25000;
        employee1.specialization = "AC Technician ";


        manager1.printSalary();
        manager1.otherDetails();

        employee1.printSalary();
        employee1.otherDetails();

    }
}
