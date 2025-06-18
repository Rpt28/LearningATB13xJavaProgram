package ex_12_DoWhile;

import java.util.Scanner;

public class Lab057_Task_GradeCalculator {
    public static void main(String[] args) {
        // Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        System.out.println("Please enter your marks to calculate grade = ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        String result = (marks >= 90) ? "A" : (marks < 90 && marks >= 80) ? "B" : (marks < 80 && marks >= 70) ? "C" : (marks < 70 && marks >= 60) ? "D" : "E";
        System.out.println(result);
    }

}
