package com.bughra.java.day08.exer;

public class Person {

    String name;
    int age;
    /**
     * sex:1 indicates male
     * sex:0 indicates female
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age: " + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
