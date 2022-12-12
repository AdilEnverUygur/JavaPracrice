package com.bughra.java.day08.exer;

/*
 4.Object array topic:
    Define the class Student, which contains three attributes: student number number(int), grade state(int), and grade score(int).
    Create 20 student objects, with student numbers ranging from 1 to 20, and grades and grades are determined by random numbers.
    Question 1: Print out the student information of grade 3 (state value is 3).
    Question 2: Use bubble sort to sort by student grades and traverse all student information

    hint:
    1) Generate random numbers: Math.random(), return value type double;
    2) Rounding to an integer: Math.round(double d), the return value type is long.

    This code is an improvement on StudentTest.java: the function of manipulating arrays is encapsulated into methods.

 */
public class StudentTest1 {
    public static void main(String[] args) {

        // Declare an array of Student type
        Student1[] stus = new Student1[20];

        for (int i = 0;i < stus.length;i++){
            // Assign values to array elements
            stus[i] = new Student1();
            // Assign values to the properties of the Student object
            stus[i].number = (i + 1);
            //state:[1,6]
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //score: [0,100]
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        StudentTest1 test = new StudentTest1();

        // Loop through the student array
        test.print(stus);


        System.out.println("***************************************************");
        //Question 1: Print out the student information of grade 3 (state value is 3).
        test.searchState(stus,3);


        System.out.println("***************************************************");
        //Question 2: Use bubble sort to sort by student grades and traverse all student information
        test.sort(stus);

        // Loop through the student array
        test.print(stus);
    }

    /**
     * @Description The operation of traversing the Student1[] array
     * @param stus
     */
    public void print(Student1[] stus){
        for (int i = 0;i < stus.length;i++){
            System.out.println(stus[i].info());
        }
    }

    /**
     *
     * @Description Find the student information of the specified grade in the Stduent array
     * @param stus the array to look up
     * @param state the grade you are looking for
     */
    public void searchState(Student1[] stus, int state){
        for (int i = 0;i < stus.length;i++){
            if (stus[i].state == state){
                System.out.println(stus[i].info());
            }
        }
    }

    /**
     * @Description Sort the Student1 array
     * @param stus
     */
    public void sort(Student1[] stus){
        for (int i = 0;i < stus.length - 1;i++){
            for (int j = 0;j < stus.length - 1 - i;j++){
                if (stus[j].score > stus[j + 1].score){
                    //If you need to change the order, the elements of the array are exchanged: the Student object! !
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}

class Student1{

    int number;
    int state;
    int score;

    // method to display student information
    public String info(){
        return "Student No: " + number + ", state: " + state + ",Score: " + score;
    }

}
