package ex_06_UserInput;

public class Lab030_CLI_Input {
    public static void main(String[] args) {
        String age_String = args[0];
        System.out.println(age_String);
        int age = Integer.parseInt(age_String);
        if(age>10) {
            System.out.println("You can vote");
        }
        else {
            System.out.println("You cannot vote");
        }

      //  System.out.println(args[5]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);
     //   System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException

    }
}
