package ex_03_Literals;

public class Lab011_FinalLiteral {
    public static void main(String[] args) {
        int local = 0;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println(PI);

        // Literal
        int age = 65;
        System.out.println(age);

        float pi = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;

        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(x);

        boolean is_married = true;
        boolean is_married_amit = false;
//         boolean is_married_amit = 123; //not possible
        System.out.println(is_married);
        System.out.println(is_married_amit);

        int Enum = 9; // enum is keyword as E is in caps.
        System.out.println(Enum); //9 output

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10
        System.out.println(binary_num);

        // Octal base? -> 8
        int octal = 0101;
        System.out.println(octal);

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        System.out.println(hex);
        //base 16 color combination are in hex - #28a745

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod is old"+carriage_return+"Dutta");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
    }
}