package ex_05_Ternary_Operator;

public class Lab024_Task_OddEven {
    public static void main(String[] args) {
        // Program 2: Check Even or Odd
        // Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;
        int number=11;
        String result = (number%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}
