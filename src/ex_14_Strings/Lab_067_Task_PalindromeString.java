package ex_14_Strings;

import java.util.Scanner;

public class Lab_067_Task_PalindromeString {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        int i;
        String str1;
        String str2="";
        System.out.println("Enter a string to check if it is palindrome or not = ");
        Scanner sc = new Scanner(System.in);
        str1=sc.nextLine();
        str1=str1.replaceAll("[^A-Za-z0-9]","");
        for(i=str1.length()-1;i>=0;i--) {
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("String is palindrome");
        }
        else
            System.out.println("String is not palindrome");



    }
}
