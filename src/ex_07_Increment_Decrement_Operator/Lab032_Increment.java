package ex_07_Increment_Decrement_Operator;

public class Lab032_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // 10+1 assigned // pre - increment
        System.out.println(a);
        System.out.println("b ="+b);

        int c= 10;
        System.out.println(++c);
        System.out.println("c ="+c);


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println("a_post ="+a_post);

        int d = 10;
        System.out.println(d++ + d);
        d=10;
        System.out.println(d++ + ++d);
        d=10;
        System.out.println(++d + ++d);
    }
}
