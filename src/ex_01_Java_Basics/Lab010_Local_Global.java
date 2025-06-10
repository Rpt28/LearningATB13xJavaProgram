package ex_01_Java_Basics;

public class Lab010_Local_Global {
    public static void main(String[] args) {
        {
            int b=10;
            System.out.println(b);
        }
        int b=100;
        System.out.println(b);

    }
}
