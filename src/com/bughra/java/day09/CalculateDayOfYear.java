package com.bughra.java.day09;

public class CalculateDayOfYear {

    public static int dayOfYear(int year, int month, int day){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year % 4 == 0){
            days[1] = 29;
        }

        for (int i = 0 ;i < month - 1;i ++){
            day = day + days[i];
        }
        return day;
    }

    public static void main(String[] args) {
        int day = dayOfYear(2022,12,31);
        System.out.println("Day Of Year: " + day);
    }
}
