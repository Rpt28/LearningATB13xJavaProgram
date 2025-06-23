package ex_14_Strings;

public class Lab064_String_Function {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat("E"));

        String name = "Pramod";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());

        String s6 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // SCP | OA
        // 1 | 3 -> 4

    }
}

