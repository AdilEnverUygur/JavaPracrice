package com.bughra.java.day08.exer;

/*
    2. Using the object-oriented programming method, design the Circle class to calculate the area of the circle.
 */
//test class
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 2.1;

          //Corresponding method 1:
//        double area = c1.findArea();
//        System.out.println(area);

         //Corresponding method 2:
         c1.findArea();

         //wrong call
//        double area = c1.findArea(3.4);
//        System.out.println(area);
    }
}

//circle
class Circle{

    //properties
    double radius;

    //Find the area of the circle
    //method one:
//    public double findArea(){
//        double area = Math.PI * radius * radius;
//        return area;
//    }

    //method two:
    public void findArea(){
        double area = Math.PI * radius * radius;
        System.out.println("area is: " + area);
    }

    //Wrong condition:
//    public double findArea(double r){
//        double area = 3.14 * r * r;
//        return area;
//    }

}
