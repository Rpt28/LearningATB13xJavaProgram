package ex_12_DoWhile;

import java.util.Scanner;

public class Lab056_Task_LeapYear {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.
        System.out.println("Enter year to check if it is a Leap year or Not = ");
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year");
        } else
            System.out.println("Not a leap year");
    }
}
