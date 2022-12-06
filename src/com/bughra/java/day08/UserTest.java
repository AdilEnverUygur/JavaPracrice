package com.bughra.java.day08;

/*
 * Use of attributes in classes
 *
 * Properties (member variables) vs local variables
 * 1. The same points:
 *  1.1 Format of defining variables: data type variable name = variable value
 *  1.2 Declare first, use later
 *  1.3 Variables have their corresponding scope
 *
 *
 *
 * 2. Differences:
 *  2.1 The difference in the position declared in the class
 *  Attributes: directly defined within a pair of {} in the class
 *  Local variables: variables declared in methods, method parameters, code blocks, constructor parameters, and constructors
 *
 *  2.2 Differences about permission modifiers
 *  Attributes: When declaring attributes, you can specify their permissions and use permission modifiers.
 *  Common permission modifiers: private, public, default, protected ---> encapsulation
 *  At present, when everyone declares attributes, they all use the default.
 *  Local variables: permission modifiers are not allowed.
 *
 *  2.3 The case of default initialization value:
 *  Attribute: The attribute of the class, according to its type, has a default initialization value.
 *      Integer (byte, short, int, long): 0
 *      Floating point type (float, double): 0.0
 *      Character type (char): 0 (or '\u0000')
 *      Boolean (boolean): false
 *      Reference data type (class, array, interface): null
 *
 *  Local variables: no default initialization value.
 *      It means that we must explicitly assign a value before calling a local variable.
 *      In particular: when the formal parameter is called, we can assign it.
 *
 *  2.4 Location loaded in memory:
 *  Attribute: loaded into the heap space (non-static)
 *  Local variables: loaded into stack space
 *
 */

public class UserTest {

    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("Uyghur Language");
        u1.eat();
    }
}

class User{

    //attribute(member variable)
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language: formal parameter, also a local variable
        System.out.println("We use " + language + " to talk");
    }

    public void eat(){
        String food = "Lagman";// local variables
        System.out.println("Uyghurs like eat: " + food);
    }
}
