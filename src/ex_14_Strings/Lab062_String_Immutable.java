package ex_14_Strings;

public class Lab062_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // SCP
//        name.toUpperCase();
        name = name.toUpperCase(); // PRAMOD
        System.out.println(name);

        String s1 = "hello";
        s1 = s1.concat("world"); // Concat, basically add the value or merge the value in the end.
        System.out.println(s1);
    }
}
