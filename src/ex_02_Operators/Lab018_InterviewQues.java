package ex_02_Operators;

public class Lab018_InterviewQues {
    public static void main(String[] args) {
        // concatination
        System.out.println("Pramod" + "Dutta");
//        System.out.println("Pramod" / "Dutta");
//        System.out.println("Pramod" * "Dutta");
//        System.out.println("Pramod" - "Dutta");

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // + -> behave differently with the data type.
        // + -> operator overloading

        String first_name = "Pramod";
        String last_name = "Dutta";

        int x = 10;
        int y = 10;

//        System.out.println(first_name + last_name + x + y);
//        System.out.println(x + y + first_name + last_name);

        System.out.println(first_name + last_name + (x + y));

        // BODMAS - Bracket of Div, mul, add, sub

        System.out.println((9 * 3 / 9 + 1) * 3);
        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        System.out.println(!(10>20));

        int c = 10;
        boolean d = (10 == 11); // == -> Comparison 2 values
        System.out.println(c);
        System.out.println(d);

        long l = 10l; // 8 Byte, 64 Bits
        String s = "name"; //  8 Byte, 64 Bits

        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);

        System.out.println('A' == 65);
        short e = 10;
        char f = 'A';
        String s1 = "A";
        System.out.println(e+f);
        System.out.println(e);
        System.out.println(e+e);
        System.out.println(e+s1);
    }
}
