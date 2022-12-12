package com.bughra.java.day08.exer;
/*
 * 3.1 Write a program, declare a method function, print a 10*8*-shaped rectangle in the method, and call the method in the main method.
 * 3.2 Modify the previous program. In the method function, in addition to printing a 10*8*-shaped rectangle, calculate the area of the rectangle.
 * and use it as method return value. Call this method in the main method, receive the returned area value and print it.
 *
 * 3.3 Modify the previous program, provide m and n parameters in the method function, and print a m*n*-type rectangle in the method,
 * And calculate the area of the rectangle, and use it as the return value of the method. Call this method in the main method, receive the returned area value and print it.

 */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();

        //3.1 Test
//        test.method();

        //3.2 Test
        // method 1:
//       int area =  test.method();
//       System.out.println("Area is: " + area);
//
        //method 2:
//        System.out.println("Area is: " + test.method());
        //3.3 Test
       int area = test.method(12,10);
        System.out.println("Area is: " + area);
    }

      //3.1
//    public void method(){
//        for (int i = 0;i < 10;i++){
//            for (int j = 0;j < 8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

     //3.2
//        public int method(){
//        for (int i = 0;i < 10;i++){
//            for (int j = 0;j < 8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        return 10 * 8;
//    }

    public int method(int m, int n){
                for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
