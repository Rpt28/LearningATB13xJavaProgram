package ex_06_UserInput;

import java.util.Scanner;

public class Lab031_Scanner_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);

        System.out.println("Enter the String");
        String s =  scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);


        System.out.println("Enter the Double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
    }
}
