package com.bughra.java.day08.exer;

/*
    Require:
        (1) Create an object of the Person class, set the name, age and sex attributes of the object, and call the study method,
        Output the string "studying", call the showAge() method to display the age value,
        Call the addAge() method to add 2 years to the object's age property.
        (2) Create a second object, perform the above operations, and experience the relationship between different objects of the same class.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();

        p1.showAge();

        int newAge = p1.addAge(2);
        System.out.println(p1.name + "'s new age is: " + newAge);

        System.out.println(p1.age);//20

        //**********************************
        Person p2 = new Person();
        p2.showAge();//0
        p2.addAge(10);
        p2.showAge();//10

        p1.showAge();
    }
}
