package ex_08_If_Else;

import java.util.Scanner;

public class Lab036_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        int a = 10;

        if(age <= 18){
            System.out.println("Not allowed to vote!");
        }else{
            System.out.println("Allowed to vote");
        }

        int b = 10;
        if (b == 4) {
            System.out.println("haha");
        } else {
            System.out.println("hoho");
        }

    }
}
