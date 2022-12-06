package com.bughra.java.day08;

/*
    1.The design class is actually a member of the design class

    property = variable = field
    method = member method = function

    Object of member class = instantiation of class = instantiated class

    2.The use of classes and objects (implementation of object-oriented thinking)
    (1) Create a class, design the members of the class
    (2) Create object of class
    (3) Calling the structure of an object via "object.property" or "object.method"

    3.If multiple objects of a class are created, each object independently has a set of properties of the class. (non-static)
      Means: if we modify property A of one object, it will not affect the value of property A of another object

    4.Object memory parsing
 */

//Test class
public class PersonTest {
    public static void main(String[] args) {
        //Create Person class object
        Person p1 = new Person();
        //Scanner scanner = new Scanner(System.in);

        //The structure of the calling object: properties, methods
        //calling property: "object.property"
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //calling method: "object.method"
        p1.eat();
        p1.sleep();
        p1.talk("Uyghur");
        //***********************************************************
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);
        //***********************************************************
        //Assign the object address value saved by the p1 variable to p3,causing p1 and p3 to point to the same object entity in the heap space
        Person p3 = p1;
        System.out.println(p3.name);//Tom

        p3.age = 10;
        System.out.println(p1.age);//10
    }
}

class Person{

    //Variable(Property)
    String name;
    int age = 1;
    boolean isMale;

    //Method
    public void eat(){
        System.out.println("Human can eat");
    }

    public void sleep(){
        System.out.println("human can sleep");
    }

    public void talk(String language){
        System.out.println("human can talk, use for: " + language);
    }
}
