package com.bughra.java.day08;

/*
 *  Declaration and use of methods in a class
 *
 *  Method: Describes the functionality that the class should have.
 *  For example: Math class: sqrt()\random() \...
       Scanner class: nextXxx()...
       Arrays class: sort() \ binarySearch() \ toString() \ equals() \ ...
 *  1.Examples:
 *   public void eat(){}
 *   public void sleep(int hour){}
 *   public String getName(){}
 *   public String getNation(String nation){}
 *
 *  2.Method declaration: permissionModifier    returnValueType    methodName (parameter list){
                                    method body
                    }
    Note: methods modified by static, final, and abstract will be discussed later.
 *
 *  3.illustrate:
        3.1 About the permission modifier: the permission modifier of the default method first uses public
        The 4 kinds of permission modifiers stipulated by Java: private, public, default, protected --> encapsulation in detail

        3.2 Return value type: with return value vs without return value
            3.2.1 If the method has a return value, the type of the return value must be specified when the method is declared. At the same time, in the method, you need to use
                 return keyword to return a variable or constant of the specified type: "return data".
                 If the method does not return a value, void is used when the method is declared. Usually, in methods that don't return a value, you don't need
                 using return. However, if used, only "return;" means the end of this method.

            3.2.2 Should we define a method with a return value?
                ① Topic requirements
                ② Based on experience: concrete analysis of specific issues
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();

        cust1.eat();
    }
}

class Customer{

    //variable
    String name;
    int age;
    boolean isMale;

    //method
    public void eat(){
        System.out.println("customer eats");
        return;
        // Expressions cannot be declared after return
        // System.out.println("Hello");
    }

    public void sleep(int hour){
        System.out.println("rested " + hour + " hour");
    }

    public String getName(){
        if (age > 18){
            return name;
        }else {
            return "Tom";
        }
    }

    public String getNation(String nation){
        String info = "My nationality is: " + nation;
        return info;
    }
}
