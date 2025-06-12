package ex_05_Ternary_Operator;

public class Lab025_Task_GradeCalculator {
    public static void main(String[] args) {
        //Program 3: Grade Calculation Using Nested Ternary
        //Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        int marks=60;
        String result=(marks>=90)?"A+":(marks<90 && marks>=75)?"A":(marks<75 && marks>=60)?"B":(marks<60 && marks>=40)?"C":"Fail";
        System.out.println(result);
    }
}
