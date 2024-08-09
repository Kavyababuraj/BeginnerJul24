package org.example.oops_1;

public class Main {

    public static void main(String[] args) {
        Student one = new Student();
        one.name = "Kavya";
        one.age = 24;
        one.psp = 95;
        one.changeBatch();
        one.joinClass();
        one.printDetails();

        Student two = new Student();
        two.name = "Ammu";
        two.age = 25;
        two.psp = 100;
        two.printDetails();
    }
}
