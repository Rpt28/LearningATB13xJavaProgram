package ex_15_String_Builder_Buffer;

public class Lab067_String_Builder_Buffer_Functions {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);


        System.out.println(stringBuffer.reverse());//to reverse the string directly with function

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(123);

        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbuffer = new StringBuffer("Java");
        sbuffer.append(" Programming");
        System.out.println(sbuffer);
        sbuffer.delete(5,16); // Delete the substring
        System.out.println(sbuffer);
        sbuffer.replace(0, 4, "C++");
        System.out.println(sbuffer);

    }
}
